package com.one.ht.web;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.one.ht.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@RestController
public class RibbonConsumerBookController {


    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook(){
        LinkedList<BookInfo> forObject = restTemplate.getForObject("http://provider-server/getAllBook",LinkedList.class);
        System.out.println(forObject);
        return forObject;
    }


    public List<BookInfo> error(){
        System.out.println("服务熔断了");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("西游记");
        List<BookInfo> fallbackList = new LinkedList<>();
        fallbackList.add(bookInfo);
        return fallbackList;
    }

}

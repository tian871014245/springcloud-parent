package com.one.ht.web;

import com.one.ht.model.BookInfo;
import com.one.ht.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook(){
        List<BookInfo> allBook = bookInfoService.getAllBook();
        if (null == allBook){
            return null;
        }
        for (BookInfo bookInfo : allBook){
            System.out.println(bookInfo);
        }
        System.out.println(allBook);
        return allBook;
    }
}

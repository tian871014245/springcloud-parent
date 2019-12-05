package com.one.ht.service;


import com.one.ht.model.BookInfo;
import com.one.ht.service.Impl.BookServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider-server",fallback = BookServiceImpl.class)
public interface BookService {
    @GetMapping(value = "/getAllBook")
    List<BookInfo> getAllBook();
}

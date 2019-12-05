package com.one.ht.service.Impl;

import com.one.ht.model.BookInfo;
import com.one.ht.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        return null;
    }
}

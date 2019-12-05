package com.one.ht.service.Impl;

import com.one.ht.mapper.BookInfoMapper;
import com.one.ht.model.BookInfo;
import com.one.ht.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public List<BookInfo> getAllBook() {
        BookInfo bookInfo = new BookInfo();
        List<BookInfo> bookInfos = bookInfoMapper.queryBookInfo(bookInfo);
        return bookInfos;
    }
}

package com.one.ht.mapper;

import com.one.ht.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookInfoMapper {

    @Select("select * from book_info")
    List<BookInfo> queryBookInfo(BookInfo bookInfo);
}

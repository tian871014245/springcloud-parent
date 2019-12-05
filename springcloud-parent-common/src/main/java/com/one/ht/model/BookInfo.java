package com.one.ht.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookInfo implements Serializable {

    private Integer bookId;
    private String bookName;
    private Integer bookStore;
    private double bookPrice;
}

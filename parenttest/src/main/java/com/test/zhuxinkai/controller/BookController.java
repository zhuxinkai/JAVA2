package com.test.zhuxinkai.controller;

import com.test.zhuxinkai.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class BookController {
    @Autowired
    Book book;
        @GetMapping(value = "/book")

    public byte[] book() throws UnsupportedEncodingException {
        return book.toString().getBytes("ISO-8859-1");
    }

}

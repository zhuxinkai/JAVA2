package com.test.zhuxinkai.controller;

import com.test.zhuxinkai.Book;
import com.test.zhuxinkai.service.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>parenttest</h3>
 * <p>用于测试@ControllerAdvice  +@InitBinder </p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-09 11:04
 **/

@RestController
public class BookConterller2 {
    @GetMapping("/book2")
    @ResponseBody
    public String book(Book book, Author author){
        return book.toString() + ">>>" + author.toString();

    }
}

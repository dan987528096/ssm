package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @ResponseBody
    public Object insert(Book book){
        return bookService.insert(book);
    }

    @RequestMapping("/queryBook")
    @ResponseBody
    public List<Book> queryBook(){
        return bookService.queryBookList();
    }
}

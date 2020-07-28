package com.zking.ssm.service;

import com.zking.ssm.model.Book;

import java.util.List;

public interface IBookService {

    int insert(Book record);

    List<Book> queryBookList();
}

package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public List<Book> queryBookList() {
        return bookMapper.queryBookList();
    }
}

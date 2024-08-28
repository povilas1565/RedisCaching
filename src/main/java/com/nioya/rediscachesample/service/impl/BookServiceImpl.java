package com.nioya.rediscachesample.service.impl;


import com.nioya.rediscachesample.model.Book;
import com.nioya.rediscachesample.service.BookService;
import com.nioya.rediscachesample.utils.Constants;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    @Cacheable(value = Constants.CacheNames.ALL_BOOKS, key = "T(org.springframework.cache.interceptor.SimpleKey).hashCode()")
    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(Book.builder().id(1).name("RANDOM").build());
        bookList.add(Book.builder().id(2).name("RANDOM").build());
        bookList.add(Book.builder().id(3).name("RANDOM").build());
        return bookList;
    }

    @Cacheable(value = Constants.CacheNames.BOOK)
    @Override
    public Book getBookById(int id) {
        return Book.builder().id(id).name("RANDOM").build();
    }
}

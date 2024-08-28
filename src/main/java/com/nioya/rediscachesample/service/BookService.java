package com.nioya.rediscachesample.service;


import com.nioya.rediscachesample.model.Book;
import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(int id);

}

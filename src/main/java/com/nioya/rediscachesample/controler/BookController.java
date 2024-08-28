package com.nioya.rediscachesample.controler;

import com.nioya.rediscachesample.model.Book;
import com.nioya.rediscachesample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/all")
    public List<Book> getAllRestaurants() {
        return bookService.getAllBooks();
    }


}

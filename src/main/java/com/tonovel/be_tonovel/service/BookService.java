package com.tonovel.be_tonovel.service;

import com.tonovel.be_tonovel.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(int id);
}

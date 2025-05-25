package com.tonovel.be_tonovel.controller;

import com.tonovel.be_tonovel.model.Book;
import com.tonovel.be_tonovel.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@Tag(name = "Books", description = "API per la gestione dei libri")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping
    @Operation(summary = "Elenca tutti i libri")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Recupera i dettagli di un libro")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }
}

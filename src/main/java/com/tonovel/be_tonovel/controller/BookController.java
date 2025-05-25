package com.tonovel.be_tonovel.controller;

import com.tonovel.be_tonovel.datalayer.entities.*;
import com.tonovel.be_tonovel.datalayer.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired private BookRepository bookRepository;
    @Autowired private PageRepository pageRepository;
    @Autowired private ImageRepository imageRepository;
    @Autowired private RangeRepository rangeRepository;
    @Autowired private BnkFileRepository bnkFileRepository;

    // GET /api/books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET /api/books/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id)
                .map(book -> ResponseEntity.ok(book))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // GET /api/books/{bookId}/pages
    @GetMapping("/{bookId}/pages")
    public List<Page> getPagesByBook(@PathVariable Long bookId) {
        return pageRepository.findByBookId(bookId);
    }

    // GET /api/books/{bookId}/images
    @GetMapping("/{bookId}/images")
    public List<Image> getImagesByBook(@PathVariable Long bookId) {
        return imageRepository.findByBookId(bookId);
    }

    // GET /api/books/{bookId}/ranges
    @GetMapping("/{bookId}/ranges")
    public List<Range> getRangesByBook(@PathVariable Long bookId) {
        return rangeRepository.findByBookId(bookId);
    }

    // GET /api/books/{bookId}/bnkfiles
    @GetMapping("/{bookId}/bnkfiles")
    public List<BnkFile> getBnkFilesByBook(@PathVariable Long bookId) {
        return bnkFileRepository.findByBookId(bookId);
    }
}

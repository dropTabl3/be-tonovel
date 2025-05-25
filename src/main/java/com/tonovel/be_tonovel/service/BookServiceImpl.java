package com.tonovel.be_tonovel.service;

import com.tonovel.be_tonovel.model.Book;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    private final List<Book> mockBooks = List.of(
            Book.builder()
                    .id(1)
                    .titolo("Il Mondo di ChatGPT")
                    .autore("Califfo Ciociaro")
                    .dataPubblicazione(LocalDate.of(2024, 5, 22))
                    .build(),
            Book.builder()
                    .id(2)
                    .titolo("Introduzione a Spring Boot")
                    .autore("Bardo Equestri")
                    .dataPubblicazione(LocalDate.of(2023, 11, 12))
                    .build()
    );

    @Override
    public List<Book> getAllBooks() {
        return mockBooks;
    }

    @Override
    public Book getBookById(int id) {
        return mockBooks.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Libro non trovato con id: " + id));
    }
}

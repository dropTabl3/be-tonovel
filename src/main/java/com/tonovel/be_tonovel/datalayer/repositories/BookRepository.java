package com.tonovel.be_tonovel.datalayer.repositories;

import com.tonovel.be_tonovel.datalayer.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { }

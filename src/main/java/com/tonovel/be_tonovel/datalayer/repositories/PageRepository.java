package com.tonovel.be_tonovel.datalayer.repositories;

import com.tonovel.be_tonovel.datalayer.entities.Book;
import com.tonovel.be_tonovel.datalayer.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PageRepository extends JpaRepository<Page, Long> {
    List<Page> findByBookId(Long bookId);
}

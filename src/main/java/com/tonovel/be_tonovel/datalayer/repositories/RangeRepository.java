package com.tonovel.be_tonovel.datalayer.repositories;

import com.tonovel.be_tonovel.datalayer.entities.Page;
import com.tonovel.be_tonovel.datalayer.entities.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RangeRepository extends JpaRepository<Range, Long> {
    List<Range> findByBookId(Long bookId);
}

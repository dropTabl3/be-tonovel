package com.tonovel.be_tonovel.datalayer.repositories;

import com.tonovel.be_tonovel.datalayer.entities.BnkFile;
import com.tonovel.be_tonovel.datalayer.entities.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BnkFileRepository extends JpaRepository<BnkFile, Long> {
    List<BnkFile> findByBookId(Long bookId);
}

package com.tonovel.be_tonovel.datalayer.repositories;

import com.tonovel.be_tonovel.datalayer.entities.Image;
import com.tonovel.be_tonovel.datalayer.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByBookId(Long bookId);

}

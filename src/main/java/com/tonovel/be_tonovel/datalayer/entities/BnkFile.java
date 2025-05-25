package com.tonovel.be_tonovel.datalayer.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "page")
@Data
public class BnkFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    private String filePath;

    private String descrizione;

    @Column(name = "book_id")
    private Long bookId;

}

package com.tonovel.be_tonovel.datalayer.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "page")
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "percorso_file")
    private String percorsoFile;

    private String descrizione;

    @Column(name = "book_id")
    private Long bookId;
}

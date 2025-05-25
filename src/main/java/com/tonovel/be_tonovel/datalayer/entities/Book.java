package com.tonovel.be_tonovel.datalayer.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;

    private String autore;

    @Column(name = "data_pubblicazione")
    private LocalDate dataPubblicazione;

}

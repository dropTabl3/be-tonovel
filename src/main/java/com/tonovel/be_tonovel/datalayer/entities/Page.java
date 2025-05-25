package com.tonovel.be_tonovel.datalayer.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "page")
@Data
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_pagina")
    private Integer numeroPagina;

    private String testo;

    @Column(name = "book_id")
    private Long bookId;
}

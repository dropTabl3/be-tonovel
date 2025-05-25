package com.tonovel.be_tonovel.datalayer.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "page")
@Data
public class Range {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pagina_da")
    private Integer paginaDa;

    @Column(name = "pagina_a")
    private Integer paginaA;

    @Column(name = "var_a")
    private String varA;

    @Column(name = "var_b")
    private String varB;

    @Column(name = "book_id")
    private Long bookId;

}

package com.github.tidinho.permuta.models;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.github.tidinho.permuta.enums.Permissao;

@Entity
public class Policial {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "matricula", unique = true)
    private String matricula;
    
    @Column(name = "senha")
    private String senha;

    @Enumerated(STRING)
    private Permissao permissao;
}

package com.github.tidinho.permuta.models;

import static javax.persistence.CascadeType.DETACH;
import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.github.tidinho.permuta.enums.StatusDePermuta;

@Entity
public class Permuta {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "data_inicial")
    private LocalDateTime dataInicial;

    @Column(name = "data_final")
    private LocalDateTime dataFinal;

    @JoinColumn(name = "solicitante_id")
    @ManyToOne(cascade = DETACH)
    private Policial solicitante;
    
    @JoinColumn(name = "solicitado_id")
    @ManyToOne(cascade = DETACH)
    private Policial solicitado;

    @Enumerated(STRING)
    private StatusDePermuta status;

}

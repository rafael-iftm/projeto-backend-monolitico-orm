package com.example.delivery.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Rastreamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataHora;
    private String status;
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;

    public Rastreamento(Date dataHora, String status, String localizacao, Pacote pacote) {
        this.dataHora = dataHora;
        this.status = status;
        this.localizacao = localizacao;
        this.pacote = pacote;
    }

    public String getResumo() {
        return String.format("Status: %s, DataHora: %s, Localizacao: %s", status, dataHora, localizacao);
    }
}
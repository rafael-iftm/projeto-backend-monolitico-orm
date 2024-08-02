package com.example.delivery.model;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Pacote {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destinatario;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    private String status;

    @OneToMany(mappedBy = "pacote", cascade = CascadeType.ALL)
    private List<Rastreamento> rastreamentos = new ArrayList<>();

    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao) {
        this.status = novoStatus;
        Rastreamento rastreamento = new Rastreamento(dataHora, novoStatus, localizacao, this);
        this.rastreamentos.add(rastreamento);
    }
}
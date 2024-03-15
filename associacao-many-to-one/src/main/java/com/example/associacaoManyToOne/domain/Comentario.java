package com.example.associacaoManyToOne.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String conteudo;

    @ManyToOne
    private Postagem postagem;

    // Getters e Setters
    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

}

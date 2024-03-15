package com.example.associacaoManyToOne.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String conteudo;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios = new ArrayList<>();

    public void addComment(Comentario comentario) {
        comentarios.add(comentario);
        comentario.setPostagem(this);
    }

    public void removeComment(Comentario comentario) {
        comentarios.remove(comentario);
        comentario.setPostagem(null);
    }

    // Getters e Setters
}
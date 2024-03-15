package com.example.associacaoManyToOne.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.associacaoManyToOne.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}
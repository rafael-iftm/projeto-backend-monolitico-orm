package com.example.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.delivery.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
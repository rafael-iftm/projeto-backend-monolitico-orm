package com.example.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.delivery.model.Rastreamento;

@Repository
public interface RastreamentoRepository extends JpaRepository<Rastreamento, Long> {

    List<Rastreamento> findAllByPacote_id(Long pacote_id);

}
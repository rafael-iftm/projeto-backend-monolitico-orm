package com.example.delivery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.delivery.model.Pacote;
import com.example.delivery.repository.PacoteRepository;

@Service
public class PacoteService {
    @Autowired
    private PacoteRepository repo;

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Pacote busca(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Pacote não encontrado"));
    }

    public Pacote atualiza(Long id, Pacote pacote) {
        Pacote pacoteExistente = repo.findById(id).orElseThrow(() -> new RuntimeException("Pacote não encontrado"));
        pacoteExistente.setDestinatario(pacote.getDestinatario());
        pacoteExistente.setEndereco(pacote.getEndereco());
        pacoteExistente.setStatus(pacote.getStatus());
        pacoteExistente.setRastreamentos(pacote.getRastreamentos());
        return repo.save(pacoteExistente);
    }

    public Pacote salva(Pacote pacote) {
        return repo.save(pacote);
    }

    public List<Pacote> listAll() {
        List<Pacote> lista = new ArrayList<>();
        repo.findAll().forEach(lista::add);
        return lista;
    }
}
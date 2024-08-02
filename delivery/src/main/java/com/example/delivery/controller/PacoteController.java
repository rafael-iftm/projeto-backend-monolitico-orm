package com.example.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.model.Pacote;
import com.example.delivery.service.PacoteService;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    @Autowired
    private PacoteService service;

    @GetMapping
    public List<Pacote> getAllPacotes() {
        return service.listAll();
    }

    @PostMapping
    public Pacote createPacote(@RequestBody Pacote pacote) {
        return service.salva(pacote);
    }

    @GetMapping("/{id}")
    public Pacote getPacote(@PathVariable Long id) {
        return service.busca(id);
    }

    @PutMapping("/{id}")
    public Pacote updatePacote(@PathVariable Long id, @RequestBody Pacote pacoteDetails) {
        return service.atualiza(id, pacoteDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Long id) {
        service.delete(id);
    }
}

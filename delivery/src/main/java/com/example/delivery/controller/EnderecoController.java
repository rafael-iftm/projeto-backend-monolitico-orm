package com.example.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.model.Endereco;
import com.example.delivery.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoRepository repository;
    
    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return repository.findAll();
    }

    @PostMapping
    public Endereco createEndereco(@RequestBody Endereco endereco){
        return repository.save(endereco);
    }
}
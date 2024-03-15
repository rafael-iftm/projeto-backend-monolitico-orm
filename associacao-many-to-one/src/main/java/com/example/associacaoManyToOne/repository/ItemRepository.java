package com.example.associacaoManyToOne.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.associacaoManyToOne.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}
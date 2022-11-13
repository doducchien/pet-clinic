package com.example.petclinic.service;

import java.util.Set;

import com.example.petclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
    
}

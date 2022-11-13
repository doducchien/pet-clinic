package com.example.petclinic.service;

import java.util.Set;

import com.example.petclinic.model.Owner;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
    
}

package com.yorov.resource.service;

import java.util.Optional;

import com.yorov.resource.persistence.model.Foo;


public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);
    
    Iterable<Foo> findAll();

}
package com.yorov.resource.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yorov.resource.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
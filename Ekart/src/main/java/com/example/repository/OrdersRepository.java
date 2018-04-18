package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Orders;

@RepositoryRestResource(collectionResourceRel="orders",path="orders")
public interface OrdersRepository extends PagingAndSortingRepository<Orders, Long>{

}

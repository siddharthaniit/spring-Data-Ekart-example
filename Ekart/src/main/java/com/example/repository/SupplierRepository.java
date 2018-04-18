package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Suppliers;

@RepositoryRestResource(collectionResourceRel = "Suppliers", path = "suppliers")
public interface SupplierRepository extends PagingAndSortingRepository<Suppliers, Long> {
	
	public Suppliers findByName(@Param("name") String name);
}

package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Manufacturers;

@RepositoryRestResource(collectionResourceRel="manufacturers",path="manufacturers")
public interface ManufacturesRepository extends PagingAndSortingRepository<Manufacturers, Long> {
	
	public Manufacturers findByName(@Param("name") String name);

}

package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Shippers;
import com.example.model.Suppliers;
@RepositoryRestResource(collectionResourceRel="shippers", path = "shippers")
public interface ShippersRepository extends PagingAndSortingRepository<Suppliers, Long> {
	
	public Shippers findByName(@Param("shippername") String shippername);

}

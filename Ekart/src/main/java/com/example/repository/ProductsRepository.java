package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Products;

@RepositoryRestResource(collectionResourceRel="product",path="product")
public interface ProductsRepository extends PagingAndSortingRepository<Products, Long>{
	
	public Products findByProductName(@Param("productName") String productname);

}

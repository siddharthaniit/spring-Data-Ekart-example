package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Categories;

@RepositoryRestResource(collectionResourceRel="categories",path="categories")
public interface CategoriesRepository extends PagingAndSortingRepository<Categories, Long> {
	
	public Categories findByName(@Param("name") String name);

}

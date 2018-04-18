package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.OrderDetails;

@RepositoryRestResource(collectionResourceRel="orderDetails",path="orderDetails")
public interface OrdersDetailsRepository extends PagingAndSortingRepository<OrderDetails, Long> {
	
	

}

package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.PaymentModes;

@RepositoryRestResource(collectionResourceRel="paymentModes",path="paymentmodes")
public interface PaymentModesRepository extends PagingAndSortingRepository<PaymentModes, Long> {
	public PaymentModes findByModeName(@Param("name") String name);

}

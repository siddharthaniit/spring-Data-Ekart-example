package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.UserWishList;

@RepositoryRestResource(collectionResourceRel="UserWishList",path="wishlist")
public interface UserWishListRepository extends PagingAndSortingRepository<UserWishList, Long> {

}

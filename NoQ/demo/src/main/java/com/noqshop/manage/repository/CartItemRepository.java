package com.noqshop.manage.repository;

 

import java.util.List;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

 

import com.noqshop.manage.enity.CartItem;

 

@Repository

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

 

              List<CartItem> findByCartCartID(@Param("cartID")Integer cartID);

}



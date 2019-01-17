
package com.noqshop.manage.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

 

import com.noqshop.manage.enity.Cart;

 

public interface CartRepository extends JpaRepository<Cart, Integer>{

 

              Cart findByCartID(Integer cartID);

 

}
package com.noqshop.manage.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

 

import com.noqshop.manage.enity.Product;

 

@Repository

public interface ProductRepository extends JpaRepository<Product,Integer> {

 

              Product findByProductID(@Param("productID")Integer productID);

             

              Product findByProductCode(@Param("productCode")String productCode);

             

}

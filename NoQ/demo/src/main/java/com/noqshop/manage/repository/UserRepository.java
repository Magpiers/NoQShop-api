
package com.noqshop.manage.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

 

import com.noqshop.manage.enity.User;

 

@Repository

public interface UserRepository extends JpaRepository<User,Integer>{

 

}
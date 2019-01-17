package com.noqshop.manage.enity;

 

import java.io.Serializable;

import java.util.List;

 

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.OneToMany;

 

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty.Access;

 

@Entity

public class Cart implements Serializable{

 

              /**

               *

               */

              private static final long serialVersionUID = 3393097745273881411L;

 

              @Id

              @GeneratedValue(strategy=GenerationType.IDENTITY)

              private Integer cartID;

             

              private Integer userID; 

             

              public Integer getUserID() {

                             return userID;

              }

 

 

              public void setUserID(Integer userID) {

                             this.userID = userID;

              }

 

 

             

              @OneToMany(fetch= FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="cart")

              @JsonProperty(access=Access.WRITE_ONLY)

              private List<CartItem> cartItems;

 

              private Integer totalAmount;

             

              private Integer totalNoOfProducts;

             

              public Integer getTotalAmount() {

                             return totalAmount;

              }

 

 

              public void setTotalAmount(Integer totalAmount) {

                             this.totalAmount = totalAmount;

              }

 

 

              public Integer getTotalNoOfProducts() {

                             return totalNoOfProducts;

              }

 

              public void setTotalNoOfProducts(Integer totalNoOfProducts) {

                             this.totalNoOfProducts = totalNoOfProducts;

              }

 

              public Integer getCartID() {

                             return cartID;

              }

 

              public List<CartItem> getCartItems() {

                             return cartItems;

              }

 

              public void setCartItems(List<CartItem> cartItems) {

                             this.cartItems = cartItems;

              }

 

              public void setCartID(Integer cartID) {

                             this.cartID = cartID;

              }

 

              public static long getSerialversionuid() {

                             return serialVersionUID;

              }

}

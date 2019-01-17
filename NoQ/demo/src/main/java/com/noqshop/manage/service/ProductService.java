 


package com.noqshop.manage.service;

 

import java.util.List;

 

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import org.springframework.util.MultiValueMap;

 

import com.noqshop.manage.dto.CartDTO;

import com.noqshop.manage.enity.Cart;

import com.noqshop.manage.enity.CartItem;

import com.noqshop.manage.enity.Product;

import com.noqshop.manage.repository.CartItemRepository;

import com.noqshop.manage.repository.CartRepository;

import com.noqshop.manage.repository.ProductRepository;

 

@Service

public class ProductService {

 

              final private ProductRepository productRepository;

              final private CartRepository cartRepository;

              final private CartItemRepository cartItemRepository;

              public ProductService(ProductRepository productRepository,CartRepository cartRepository,CartItemRepository cartItemRepository) {

                             this.productRepository = productRepository;

                             this.cartItemRepository = cartItemRepository;

                             this. cartRepository = cartRepository;

                            

              }

             

              public Product findByProductID(Integer productID) {

                             return productRepository.findByProductID(productID);

              }

 

              public CartDTO findCartDetailsByCartID(Integer cartID) {

                             CartDTO cartDTO = new CartDTO();

                             Cart cart = cartRepository.findByCartID(cartID);

                             List<CartItem> cartItems = cartItemRepository.findByCartCartID(cartID);

                             cart.setCartItems(cartItems);

                             cartDTO.setCart(cart);

                             cartDTO.setCartItems(cartItems);

                             return cartDTO;

              }

 

              public CartItem saveCartItem(CartItem cartItem) {

                             CartItem savedCartItem = cartItemRepository.save(cartItem);

                            

                             return savedCartItem;

              }

 

              public Product findProductByProcuctCode(String productCode) {

                             // TODO Auto-generated method stub

                             return productRepository.findByProductCode(productCode);

              }

}

 

 

 


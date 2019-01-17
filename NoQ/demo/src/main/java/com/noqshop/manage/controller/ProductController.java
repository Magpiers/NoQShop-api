package com.noqshop.manage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noqshop.manage.dto.CartDTO;
import com.noqshop.manage.enity.CartItem;
import com.noqshop.manage.enity.Product;
import com.noqshop.manage.service.ProductService;

@RestController
public class ProductController {

	private final ProductService productService;
	
	public  ProductController(ProductService productService) {

		this.productService = productService;
	}
	@GetMapping("/findFirst/{id}")
	public ResponseEntity<Product> findProduct(@PathVariable("id") int id) {
		return new ResponseEntity(productService.findByProductID(id),HttpStatus.ACCEPTED);
		}
	
	@GetMapping("/findCartByCartID/{cartID}")
	public  CartDTO findCartDetailsByCartID(@PathVariable("cartID") Integer cartID){
		return productService.findCartDetailsByCartID(cartID);
	}
	@PostMapping("/cartItems")
	public ResponseEntity<CartItem> saveCartItmes(@RequestBody CartItem cartItem){
		return new ResponseEntity(productService.saveCartItem(cartItem),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findProductByCode/{productCode}")
	public   ResponseEntity<Product> findProductByProcuctCode(@PathVariable("productCode") String productCode){
		return new  ResponseEntity(productService.findProductByProcuctCode(productCode),HttpStatus.ACCEPTED);
	}
}



import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;


package com.noqshop.manage.enity;

 

import java.io.Serializable;

import java.time.LocalDate;

import java.time.LocalDateTime;

 

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

 

 

@Entity

public class Product implements Serializable{

 

              /**

               *

               */

              private static final long serialVersionUID = 6619385442703056518L;

              @Id

              @GeneratedValue

              private Integer productID;

             

              public String getProductCode() {

                             return productCode;

              }

 

              public void setProductCode(String productCode) {

                             this.productCode = productCode;

              }

             

              private String productCode;

             

              private String productName;

 

              private Double price;

             

              private Double mrp;

             

              public Integer getProductID() {

                             return productID;

              }

             

              public void setProductID(Integer productID) {

                             this.productID = productID;

              }

             

              public String getProductName() {

                             return productName;

              }

             

              public void setProductName(String productName) {

                             this.productName = productName;

              }

             

              public Double getPrice() {

                             return price;

              }

             

              public void setPrice(Double price) {

                             this.price = price;

              }

             

              public Double getMrp() {

                             return mrp;

              }

              public void setMrp(Double mrp) {

                             this.mrp = mrp;

              }

              public String getManufacture() {

                             return manufacture;

              }

              public void setManufacture(String manufacture) {

                             this.manufacture = manufacture;

              }

              public LocalDateTime getManufactureDate() {

                             return manufactureDate;

              }

              public void setManufactureDate(LocalDateTime manufactureDate) {

                             this.manufactureDate = manufactureDate;

              }

              public LocalDate getExpireDate() {

                             return expireDate;

              }

              public void setExpireDate(LocalDate expireDate) {

                             this.expireDate = expireDate;

              }

              public Integer getNoOfUnits() {

                             return noOfUnits;

              }

              public void setNoOfUnits(Integer noOfUnits) {

                             this.noOfUnits = noOfUnits;

              }

              public Double getTotal() {

                             return total;

              }

              public void setTotal(Double total) {

                             this.total = total;

              }

              public String getUnitOfMeasurementCode() {

                             return unitOfMeasurementCode;

              }

              public void setUnitOfMeasurementCode(String unitOfMeasurementCode) {

                             this.unitOfMeasurementCode = unitOfMeasurementCode;

              }

              public Integer getQuantity() {

                             return quantity;

              }

              public void setQuantity(Integer quantity) {

                             this.quantity = quantity;

              }

              public String getOfferDescription() {

                             return offerDescription;

              }

              public void setOfferDescription(String offerDescription) {

                             this.offerDescription = offerDescription;

              }

              public static long getSerialversionuid() {

                             return serialVersionUID;

              }

              private String manufacture;

              private LocalDateTime manufactureDate;

              private LocalDate expireDate;

              private Integer noOfUnits;

              private Double total;

              private String unitOfMeasurementCode;

              private Integer quantity;

              private String offerDescription;

}
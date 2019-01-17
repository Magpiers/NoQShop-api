import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty.Access;

 

@Entity

@JsonIgnoreProperties({"hiberateLazyInitializer","handler"})

public class CartItem implements Serializable{

             

              /**

               *

               */

              private static final long serialVersionUID = -2785446676943650291L;

              public Cart getCart() {

                             return cart;

              }

              public void setCart(Cart cart) {

                             this.cart = cart;

              }

              public Integer getCartItemID() {

                             return cartItemID;

              }

              public void setCartItemID(Integer cartItemID) {

                             this.cartItemID = cartItemID;

              }

              public String getProductCode() {

                             return productCode;

              }

              public void setProductCode(String productCode) {

                             this.productCode = productCode;

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

              public Double getTotal() {

                             return total;

              }

              public void setTotal(Double total) {

                             this.total = total;

              }

              public Double getDiscount() {

                             return discount;

              }

              public void setDiscount(Double discount) {

                             this.discount = discount;

              }

              public Double getPayableAmount() {

                             return payableAmount;

              }

              public void setPayableAmount(Double payableAmount) {

                             this.payableAmount = payableAmount;

              }

              public String getManufacture() {

                             return manufacture;

              }

              public void setManufacture(String manufacture) {

                             this.manufacture = manufacture;

              }

              public LocalDate getManufactureDate() {

                             return manufactureDate;

              }

              public void setManufactureDate(LocalDate manufactureDate) {

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

              @Id

              @GeneratedValue(strategy=GenerationType.IDENTITY)

              private Integer cartItemID;

             

              private String productCode;

             

              private String productName;

 

              private Double price;

             

              private Double mrp;

             

              @ManyToOne(fetch= FetchType.LAZY)

              @JsonProperty(access=Access.WRITE_ONLY)

              @JoinColumn(name="cartID")

              private Cart cart;

             

              private Double total;

             

              private Double discount;

             

              private Double payableAmount;

             

              private String manufacture;

              private LocalDate manufactureDate;

              private LocalDate expireDate;

              private Integer noOfUnits;

              private String unitOfMeasurementCode;

              private Integer quantity;

              private String offerDescription;

             

 

}

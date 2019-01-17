package com.noQ.entity;

public class ProductDetailsEntity {
	
	public String productId;
	public String productDesc;
	public float MRP;
	public float unit;
	public float price;
	
	
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	/**
	 * @return the mRP
	 */
	public float getMRP() {
		return MRP;
	}
	/**
	 * @param mRP the mRP to set
	 */
	public void setMRP(float mRP) {
		MRP = mRP;
	}
	/**
	 * @return the unit
	 */
	public float getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(float unit) {
		this.unit = unit;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

}

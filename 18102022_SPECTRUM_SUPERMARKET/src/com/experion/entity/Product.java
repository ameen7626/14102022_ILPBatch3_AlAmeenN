package com.experion.entity;

import java.time.LocalDate;

public class Product {
	
    private int serialNoOriginal;
	private String productCode;
	private String productName;
	private double productPrice;
	private LocalDate openDate;
	private LocalDate validityDate;
	private LocalDate expiryDate;
	private boolean active = true;
	private static int serialNo=0;
	public int getSerialNoOriginal() {
		return serialNoOriginal;
	}
	public void setSerialNoOriginal(int serialNoOriginal) {
		this.serialNoOriginal = serialNoOriginal;
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
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public LocalDate getOpenDate() {
		return openDate;
	}
	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}
	public LocalDate getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(LocalDate validityDate) {
		this.validityDate = validityDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public static int getSerialNo() {
		return serialNo;
	}
	public static void setSerialNo(int serialNo) {
		Product.serialNo = serialNo;
	}
	

	

}
package org.mayank.soapservice.model;

public class Products {
	
	private String name;
	private String sku;
	private double price;
	
	public Products(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

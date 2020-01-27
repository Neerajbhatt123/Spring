package com.Spring.MapCore;

import java.util.Map;

public class Customer {

	private String id;
	private Map<Integer, String> product;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<Integer, String> getProduct() {
		return product;
	}

	public void setProduct(Map<Integer, String> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", product=" + product + "]";
	}

}

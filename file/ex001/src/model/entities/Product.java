package model.entities;

public final class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double totalValue() {
		return getPrice() * getQuantity();
	}

	@Override
	public String toString() {
		return getName() + ","  + totalValue();
	}
	
}

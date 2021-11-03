package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private int quantity;
	private String name;

	public ProductImpl(int quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}

	@Override
	public String toString() {
		return "ProductImpl [quantity=" + quantity + ", name=" + name + "]";
	}

}

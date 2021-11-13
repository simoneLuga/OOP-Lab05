package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.*;


public class OrderedWareHouse extends WharehouseImpl{

	@Override
	public Set<Product> allProducts() {
		//treeSet is automatic order
		return new TreeSet<>(super.allProducts());
	}

		
}

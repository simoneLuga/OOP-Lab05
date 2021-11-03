package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WharehouseImpl implements Warehouse{
	
	private Set<Product> set;
	
	public WharehouseImpl() {
		super();
		this.set = new HashSet<>();
	}

	@Override
	public void addProduct(Product p) {
		set.add(p);
	}

	@Override
	public Set<String> allNames() {
		Iterator<Product> it = set.iterator();
		Set<String> setName = new HashSet<>();
    	
    	while(it.hasNext()) {
    		setName.add(it.next().getName());
    	}
		return setName;
	}

	@Override
	public Set<Product> allProducts() {
		Set<Product> set1=new HashSet<>();
		set1.addAll(set);
		return set1;
	}

	@Override
	public boolean containsProduct(Product p) {
		Iterator<Product> it = set.iterator();
		while(it.hasNext()) {
    		if(p.getName()==it.next().getName()) {
    			return true;
    		}
    	}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		Iterator<Product> it = set.iterator();
		while(it.hasNext()) {
    		if(name==it.next().getName()) {
    			return it.next().getQuantity();
    		}
    	}
		return -1;
	}

}

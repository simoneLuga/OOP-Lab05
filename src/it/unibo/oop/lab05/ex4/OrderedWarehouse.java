package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

/**
 *
 */
public class OrderedWarehouse extends WarehouseImpl {

    /**
     * {@inheritDoc}
     */
    public Set<Product> allProducts() {
    	Set<Product> tree = new TreeSet<>(super.allProducts());
//    	for (Product product : super.allProducts()) {
//			tree.add(product);
//		}
        return tree;
    }

}

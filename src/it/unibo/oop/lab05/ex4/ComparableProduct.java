package it.unibo.oop.lab05.ex4;
import it.unibo.oop.lab05.ex3.*;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	
	public ComparableProduct(final String name, final int quantity) {
        super(quantity, name);
    }

    /**
     * {@inheritDoc}
     */
    public int compareTo(final Product o) {
        return getName().compareTo(o.getName());
    }
}

package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> union = new HashSet<X>();
    	union.addAll(setA);
    	union.addAll(setB);
        return union;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> inter = new HashSet<X>();
    	for (X x : setA) {
			for (X x2 : setB) {
				if(x==x2) {
					inter.add(x);
				}
			}
		}
        return inter;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	//soluzione proposta dal prof migliore
    	//unione poi removeAll(intersezione);
    	
    	Set<X> syDif = new HashSet<X>();
    	Boolean noDif;
    	Set<X> inter = setIntersection(setA, setB);
    	for (X x : setA) {
    		noDif=false;
    		for (X x2 : inter) {
				if(x==x2) {
					noDif=true;
				}
			}
    		if(noDif==false) {
    			syDif.add(x);
    		}
		}
    	
    	for (X x : setB) {
    		noDif=false;
    		for (X x2 : inter) {
				if(x==x2) {
					noDif=true;
				}
			}
    		if(noDif==false) {
    			syDif.add(x);
    		}
		}
        return syDif;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	int n = new Random().nextInt(coll.size());
        for (final X x : coll) {
            if (n == 0) {
                return x;
            }
            n--;
        }
        return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	 return new Pair<>(getRandomElement(first), getRandomElement(second));
    }
}

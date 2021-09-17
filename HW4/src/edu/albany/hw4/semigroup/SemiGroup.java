package edu.albany.hw4.semigroup;

import java.util.Collection;
import java.util.Iterator;


public abstract class SemiGroup<T> {
	public abstract T operate(T b);
	
	public static <T extends SemiGroup<T>> T combine(Collection<T> list) {
		
		T sum = list.iterator().next();

		Iterator<T> iterator = list.iterator();

		iterator.next();

		while (iterator.hasNext()){

			T iteration = (T) iterator.next();

			sum = sum.operate(iteration);
			
     	}
		
		return sum;
	}
}

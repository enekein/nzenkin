package ru.job4j.set;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 01.11.2017.
 *
 * @param <E>.
 */

 public class SimpleSet<E> {
	 /**
	  * Array for storage values.
	  */
	 private Object[] array = new Object[0];

	 /**
	  * Index of array.
	  */
	 private int index = 0;

	 /**
	  * Add new element in array.
	  * @param e E.
	  */
	 public void add(final E e) {
		 boolean flag = true;
         for (Object container : array) {
             if (container.equals(e)) {
                 flag = false;
             }
         }
         if (flag) {
             checkArrayLengthAndExtend();
             array[index++] = e;
         }
	 }
	 
	 /**
	  * Check array length and extend it if needed.
	  */
	 private void checkArrayLengthAndExtend() {
		 if (array.length == index) {
			 array = Arrays.copyOf(array, array.length + 1);
		 }
	 }
	 
	 /**
	  * Iterator for array.
      * @return new Iterator.
	  */
	 public Iterator<E> iterator() {
		 return new Iterator<>() {

			 /**
			  * Index of iterator.
			  */
			 private int currentIndex = 0;

			 /**
			  * Checking for next element.
			  * @return boolean.
			  */
			 @Override
			 public boolean hasNext() {
				 return ((currentIndex < array.length)
                         && (array[currentIndex] != null));
			 }

			 /**
			  * Return element and move flag to next element.
			  * @return E.
			  */
			 @Override
			 public E next() {
				 return (E) array[currentIndex++];
			 }

			 /**
	          * Override for remove() method.
              * This method isn't supported then throw an exception.
	          */
	         @Override
	         public void remove() {
		         throw new UnsupportedOperationException(
		                 "This operation isn't supported.");
	         }
		 };
	 }
 }

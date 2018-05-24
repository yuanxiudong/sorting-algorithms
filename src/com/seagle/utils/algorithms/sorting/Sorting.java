package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * @author seagle
 *
 */
public abstract class Sorting {
	public abstract <T> void sort(List<Comparable<T>> data); 
	
	/**
	 * 
	 * @param array
	 * @param index1
	 * @param index2
	 */
	protected <T> void swap(List<Comparable<T>> array, int index1, int index2) {
		Comparable<T> temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}

	protected <T> void printArray(List<Comparable<T>> array) {
		for (int index = 0; index < array.size(); index++) {
			System.out.print("[" + index + "]=" + array.get(index) + "  ");
		}
		System.out.println();
	}
}

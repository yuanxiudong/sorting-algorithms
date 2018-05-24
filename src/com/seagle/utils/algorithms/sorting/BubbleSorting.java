package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * 
 * @author seagle
 * @since 2018-5-24
 */
public class BubbleSorting extends Sorting {

	private static int[] data = new int[] { 2, 10, 8, 4, 3, 10, 15, 7, 4, 9, 8, 11, 41, 22, 50, 10, 6 };

	public static void main(String[] args) {
		BubbleSorting<Integer> sort = new BubbleSorting<Integer>();
		sort.sort(data);
	}
	
	@Override
	public <T> void sort(List<Comparable<T>> data) {

	}


	public void sort(int[] data) {
		printArray(data);
		bubbleSort(data);
		printArray(data);
	}

	private void bubbleSort(int[] data) {
		for (int i = data.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					swap(data, j, j + 1);
				} else {
					continue;
				}
			}
		}
	}
	
	private <T> void bubbleSort(List<Comparable<T>> data) {
		for (int i = data.size() - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data.get(j).compareTo(data.get(j+1)) < 0) {
					swap(data, j, j + 1);
				} else {
					continue;
				}
			}
		}
	}

	/**
	 * 
	 * @param array
	 * @param index1
	 * @param index2
	 */
	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	private void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print("[" + index + "]=" + array[index] + "  ");
		}
		System.out.println();
	}



}

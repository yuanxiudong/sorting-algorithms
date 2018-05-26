package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Bubble sort algorithms.
 *
 * The complex rate is O(n^2).
 *
 * @author seagle
 * @since 2018-5-24
 */
public class BubbleSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        for (int i = data.size() - 1; i >= 0; i--) {
            boolean swaped = false;
            for (int j = 0; j < i; j++) {
                Comparable curtObj = data.get(j);
                Comparable nextObj = data.get(j + 1);
                if ((curtObj.compareTo(nextObj)) > 0) {
                    swap(data, j, j + 1);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }
}

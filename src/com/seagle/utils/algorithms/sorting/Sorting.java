package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Sort algorithms.
 *
 * @author seagle
 * @since 2018-5-24
 */
public abstract class Sorting {

    /**
     * Sort data.
     *
     * @param <T> data type
     * @param data data
     */
    public abstract <T extends Comparable<? super T>> void sort(List<T> data);

    /**
     * Swap two index value for array.
     *
     * @param <T> data type
     * @param array data array
     * @param index1 value1 index
     * @param index2 value2 index
     */
    protected <T> void swap(List<T> array, int index1, int index2) {
        T temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
    }
}

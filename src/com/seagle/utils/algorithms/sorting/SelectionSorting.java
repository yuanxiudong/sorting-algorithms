/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Selection sort algorithms.
 * 
 * The complex rate is O(n^2)
 *
 * @author seagle
 * @since 2018-5-26
 */
public class SelectionSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        int dataSize = data.size();
        for (int i = 0; i < dataSize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dataSize; j++) {
                if (data.get(j).compareTo(data.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                this.swap(data, minIndex, i);
            }
        }
    }

}

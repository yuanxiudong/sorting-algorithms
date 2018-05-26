/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Insert sort algorithms.
 *
 * The complex rate is O(n^2)
 *
 * @author seagle
 * @since 2018-5-26
 */
public class InsertionSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        for (int index = 1; index < data.size(); index++) {
            T object = data.get(index);
            int dstIndex = index - 1;
            while (dstIndex >= 0 && data.get(dstIndex).compareTo(object) > 0) {
                data.set(dstIndex + 1, data.get(dstIndex));
                dstIndex--;
            }
            data.set(dstIndex + 1, object);
        }
    }

}

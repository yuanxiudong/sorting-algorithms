/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Binary insert sort algorithms.
 *
 * The complex rate is O(n^2)
 *
 * @author seagle
 * @since 2018-5-26
 */
public class BinaryInsertionSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        for (int index = 1; index < data.size(); index++) {
            T target = data.get(index);
            int startIndex = 0;
            int endIndex = index;
            while (endIndex > startIndex) {
                int binaryIndex = startIndex + (endIndex - startIndex) / 2;
                if (data.get(binaryIndex).compareTo(target) > 0) {
                    for (int i = endIndex; i > binaryIndex; i--) {
                        data.set(i, data.get(i - 1));
                    }
                    endIndex = binaryIndex;
                } else {
                    startIndex = binaryIndex + 1;
                }
            }
            data.set(startIndex, target);
        }
    }
}

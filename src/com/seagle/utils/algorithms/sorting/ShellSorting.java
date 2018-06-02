/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Shell sort algorithms.
 *
 * Time Complex rate: O(n^2) Space Complex rate:O(1)
 *
 * @author seagle
 * @since 2018-6-2
 */
public class ShellSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        for (int gap = data.size() / 2; gap > 0; gap /= 2) {
            for (int index = gap; index < data.size(); index++) {
                T object = data.get(index);
                int dstIndex = index - gap;
                while (dstIndex >= 0 && data.get(dstIndex).compareTo(object) > 0) {
                    data.set(dstIndex + gap, data.get(dstIndex));
                    dstIndex -= gap;
                }
                data.set(dstIndex + gap, object);
            }
        }
    }
}

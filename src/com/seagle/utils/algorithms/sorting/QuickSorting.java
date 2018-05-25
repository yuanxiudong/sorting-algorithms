package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 * Quick sort algorithms.
 *
 * The complex rate is O(nlogn).
 *
 * @author seagle
 * @since 2018-5-24
 */
public class QuickSorting extends Sorting {

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> data) {
        quickSort(data, 0, data.size() - 1);
    }

    /**
     * Quick sort recursion.
     *
     * @param T data type
     * @param dataArray data
     * @param startIndex array start index
     * @param endIndex array end index
     */
    private <T extends Comparable<? super T>> void quickSort(List<T> dataArray, int startIndex, int endIndex) {
        T signData = dataArray.get(startIndex);
        int firstIndex = startIndex;
        int lastIndex = endIndex;
        while (startIndex < endIndex) {
            while (dataArray.get(endIndex).compareTo(signData) > 0) {
                endIndex--;
            }
            if (startIndex < endIndex) {
                dataArray.set(startIndex, dataArray.get(endIndex));
                startIndex++;
                while (dataArray.get(startIndex).compareTo(signData) < 0) {
                    startIndex++;
                }
                if (startIndex < endIndex) {
                    dataArray.set(endIndex, dataArray.get(startIndex));
                    endIndex--;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        dataArray.set(endIndex, signData);

        if (startIndex > firstIndex) {
            quickSort(dataArray, firstIndex, startIndex - 1);
        }

        if (endIndex < lastIndex) {
            quickSort(dataArray, endIndex + 1, lastIndex);
        }
    }
}

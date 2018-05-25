package com.seagle.utils.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sort algorithms test.
 *
 * @author seagle
 * @since 2018-5-24
 */
public class SortingAlgorithmsMain {

    private enum SortAlgorithmsType {
        Type_Bubble, Type_Quick
    }

    private static Integer[] data = new Integer[]{2, 10, 8, 4, 3, 10, 15, 7, 4, 9, 8, 11, 41, 22, 50, 10, 6};

    public static void main(String[] args) {
        List<Integer> dataList = Arrays.asList(data);
        long startTime = System.currentTimeMillis();
        System.out.println("Befor sort....................");
        printArray(dataList);
        Sorting sort = createSortAlgorithm(SortAlgorithmsType.Type_Quick);
        sort.sort(dataList);
        System.out.println("After sort...................." + (System.currentTimeMillis() - startTime));
        printArray(dataList);
    }

    private static Sorting createSortAlgorithm(SortAlgorithmsType type) {
        switch (type) {
            case Type_Bubble:
                return new BubbleSorting();
            case Type_Quick:
                return new QuickSorting();
            default:
                return null;
        }
    }

    private static <T> void printArray(List<T> array) {
        for (int index = 0; index < array.size(); index++) {
            System.out.print("[" + index + "]=" + array.get(index) + "  ");
        }
        System.out.println();
    }
}

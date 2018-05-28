package com.seagle.utils.algorithms.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Sort algorithms test.
 *
 * @author seagle
 * @since 2018-5-24
 */
public class SortingAlgorithmsMain {

    private enum SortAlgorithmsType {
        Bubble, Quick, Selection, Insertion,BinaryInsertion,
    }

    private static final Integer[] DATA = new Integer[]{2, 10, 8, 4, 3, 10, 15, 7, 4, 9, 8, 11, 41, 22, 50, 10, 6,0};

    public static void main(String[] args) {
        List<Integer> dataList = Arrays.asList(DATA);
        long startTime = System.currentTimeMillis();
        SortAlgorithmsType sortType = SortAlgorithmsType.Bubble;
        Sorting sort = createSortAlgorithm(sortType);
        System.out.println("Befor sort....................");
        printArray(dataList);
        sort.sort(dataList);
        System.out.println("After sort...................." + (System.currentTimeMillis() - startTime));
        printArray(dataList);
    }

    private static Sorting createSortAlgorithm(SortAlgorithmsType type) {
        switch (type) {
            case Bubble:
                return new BubbleSorting();
            case Quick:
                return new QuickSorting();
            case Selection:
                return new SelectionSorting();
            case Insertion:
                return new InsertionSorting();
            case BinaryInsertion:
                return new BinaryInsertionSorting();
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

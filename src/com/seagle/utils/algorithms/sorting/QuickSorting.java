package com.seagle.utils.algorithms.sorting;

import java.util.List;

/**
 *
 * @author seagle
 * @since 2018-5-24
 */
public class QuickSorting implements Sorting {

    private static int[] data = new int[]{2, 10, 8, 4, 3, 10, 15, 7, 4, 9, 8, 11, 41, 22, 50, 10, 6};
//	private static int[] data = new int[] { 3,4,6,2};

    public static void main(String[] args) {
        QuickSorting sort = new QuickSorting();
        sort.sort(data);
    }

    @Override
    public void sort(List data) {
        Integer it = new Integer(10);
        it.compareTo(anotherInteger)
    }

    public void sort(int[] data) {
        printArray(data);
        quickSort(data, 0, data.length - 1);
        printArray(data);
    }

    /**
     *
     * @param dataArray
     * @param startIndex
     * @param endIndex
     */
    private void quickSort(int[] dataArray, int startIndex, int endIndex) {
        int signData = dataArray[startIndex];
        int firstIndex = startIndex;
        int lastIndex = endIndex;
        while (startIndex < endIndex) {
            // �Ӻ���ǰɨ��
            while (dataArray[endIndex] > signData) {
                endIndex--;
            }
            if (startIndex < endIndex) {
                swap(dataArray, startIndex, endIndex);
                startIndex++;
            }

            // ��ǰ����ɨ��
            while (dataArray[startIndex] < signData) {
                startIndex++;
            }
            if (startIndex < endIndex) {
                swap(dataArray, startIndex, endIndex);
                endIndex--;
            }
        }

        if (startIndex > firstIndex) {
            quickSort(dataArray, firstIndex, startIndex - 1);
        }

        if (endIndex < lastIndex) {
            quickSort(dataArray, endIndex + 1, lastIndex);
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

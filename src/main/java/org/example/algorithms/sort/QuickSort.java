package org.example.algorithms.sort;

public class QuickSort {

    public static void example() {
        int[] array = new int[]{8, 7, 9, 2, 3, 1, 5, 4, 6};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; //choose the last element as the pivot

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i+1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
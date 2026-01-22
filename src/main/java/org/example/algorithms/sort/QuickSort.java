package org.example.algorithms.sort;

public class QuickSort {

    public static void example() {

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer -1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //option two:
//    private static void quickSort(int[] array, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(array, low, high);
//
//            quickSort(array, low, pivotIndex - 1);
//            quickSort(array, pivotIndex + 1, high);
//        }
//    }
//
//    private static int partition(int[] array, int low, int high) {
//        int pivot = array[high]; //choose the last element as the pivot
//
//        int i = low - 1;
//        for (int j = low; j < high; j++) {
//            if (array[j] <= pivot) {
//                i++;
//                swap(array, i, j);
//            }
//        }
//
//        swap(array, i+1, high);
//        return i + 1;
//    }

}
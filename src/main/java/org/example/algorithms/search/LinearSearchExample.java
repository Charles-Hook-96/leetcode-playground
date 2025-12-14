package org.example.algorithms.search;

/*
 *
 * 0. Linear search - Iterate through a collection one element at a time. O(n) as it is based on the elements presented
 *   0.1 Disadvantages:
 *       Very slow for large data sets (I.E as N increases)
 *    0.2 Advantages
 *       Fast for searches of small to medium data sets
 *       Does NOT need to be sorted
 *       Useful for data structures that do not have random access (I.E LinkedList)
 */
public class LinearSearchExample {

    public static void example() {

        //Linear search - simply iterating through one item at a time
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        
        int index = linearSearch (array, 5);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found: " + -1);
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
package org.example.algorithms.search;

/*
 * Binary search = Search algorithm that finds the position of a target value with a sorted array.
 * In order for a binary search to work, the array needs to be sorted
 * Half of the array is eliminated during each "step"
 * A binary search always begins in the middle - If the middle node is greater than the previous node,
 * the left half is eliminated and step 2 begins. The search then again begins in the middle, and if the target value is greater than or less than
 * the middle value, then the greater half of the array for searching would be removed
 */
public class BinarySearchExample {

    public static void example() {

        /**
         * Example using the built in "Array" Binary search
         * */
        int array[] = new int[100];
        int target = 77777;

        //Populating the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + "not found");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int startIndex = 0;
        //array.length - 1 gets the last index of the 0 based array
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            //Formula to find the middle of the searchale array
            int middle = startIndex + (endIndex - startIndex) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) {
                startIndex = middle + 1;
            } else if (value > target) {
                endIndex = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }


    /**
     * Example using the built in "Array" Binary search
     int array[] = new int[100];
     int target = 42;

     for (int i = 0; i < array.length; i++) {
     array[i] = i;
     }

     int index = Arrays.binarySearch(array, target);

     if (index == -1) {
     System.out.println(target + "not found");
     } else {
     System.out.println("Element found at: " + index);
     }
     * */
}
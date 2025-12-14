package org.example.leetcode;


//1342. Number of Steps to Reduce a Number to Zero
public class ReduceNumberToZero {

    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;

        while (num > 0) {
            if (isEven(num)) {
                num = num / 2;
                numberOfSteps++;
            } else {
                num = num - 1;
                numberOfSteps++;
            }

        }

        return numberOfSteps;
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}
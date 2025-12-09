package org.example;

//1480. Running sum of 1D Array
public class RunningSumProblem {

    //Find a running sum
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int summedNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            summedNumber += nums[i];
            result[i] = summedNumber;
        }

        return result;
    }

}
package org.example.neetcode;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == difference && j != i) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
package org.example.leetcode;


//35. Search Insert Position
//Test data: nums = [1,3,5,6], target either 2/5/7
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        for (int i = 1; i <= nums.length; i++) {
            int value = nums[i - 1];
            if (nums[i - 1] == target) {
                return i -1;
            }

            if (value > target) {
                return i -1 ;
            }

            if (value < target && i == nums.length) {
                return i;
            }
        }

        return 0;
    }

}
package org.example.neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int n: nums) {
            if (seen.contains(n)) {
                return true;
            }

            seen.add(n);
        }

//        //Brute force approach
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }

        return false;
    }
}
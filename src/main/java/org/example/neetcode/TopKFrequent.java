package org.example.neetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static int[] example(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> fm = map.entrySet().stream()
                .filter(e -> e.getValue() >= k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return fm.keySet().stream().mapToInt(Integer::intValue).toArray();
    }

}
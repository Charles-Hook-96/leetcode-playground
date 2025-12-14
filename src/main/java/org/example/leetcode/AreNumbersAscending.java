package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//2042. Check if Numbers Are Ascending in a Sentence
//Test Data: 1 box has 3 blue 4 red 6 green and 12 yellow marbles
public class AreNumbersAscending {

    public static boolean areNumbersAscending(String s) {
        String[] stringArray = s.split(" ");
        List<Integer> integers = new ArrayList<>();

        for (String string : stringArray) {

            try {
                integers.add(Integer.parseInt(string));
            } catch (NumberFormatException _) {

            }
        }

        for (int i = 0; i < integers.size() -1; i++) {
            int num = integers.get(i);
            if (num >= integers.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
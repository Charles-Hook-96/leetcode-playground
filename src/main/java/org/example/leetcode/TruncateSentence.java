package org.example.leetcode;

public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        StringBuilder compactString = new StringBuilder();
        String[] stringArray = s.split(" ");

        for (int i = 0; i < k; i++) {
            compactString.append(stringArray[i]).append(" ");
        }

        return compactString.toString().trim();
    }
}
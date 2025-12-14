package org.example.leetcode;

//58. Length of Last Word
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        int length = arr.length;
        return arr[length -1].length();
    }

}
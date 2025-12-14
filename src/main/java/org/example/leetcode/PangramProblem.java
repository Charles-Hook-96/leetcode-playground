package org.example.leetcode;

//1832. Check if the Sentence Is Pangram
public class PangramProblem {

    public static boolean checkIfPangram(String sentence) {
        boolean isPangram = true;
        int[] characterFrequencyCounts = new int[26];
        char[] characters = sentence.toCharArray();

        for (char character: characters) {
            characterFrequencyCounts[character - 'a']++;
        }

        for (int cfc: characterFrequencyCounts) {
            if (cfc < 1) {
                isPangram = false;
                break;
            }
        }

        return isPangram;
    }

}
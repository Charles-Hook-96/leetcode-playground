package org.example.leetcode;

public class ValidWordsInASentence {

    public static int countValidWords(String sentence) {
        int count = 0;

        if (hasMoreThanOneHyphen(sentence) || sentence.isBlank()) {
            return count;
        }

        //\\s+ splits on any number of spaces
        String[] sParts = sentence.split("\\s+");

        for (String s : sParts) {
            if (isWordValid(s)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isWordValid(String word) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String punctuation = "!.,";
        if (word.isEmpty()) {
            return false;
        }

        //-1 in indexOf means that it does not exist in the punctuation string defined above
        if (word.length() == 1 && punctuation.indexOf(word.charAt(0)) > -1) {
            return true;
        }

        //-1 in indexOf means that it does not exist in the letters string defined above
        if (letters.indexOf(word.charAt(0)) == -1 || word.charAt(0) == '-') {
            return false;
        }

        if (letters.indexOf(word.charAt(word.length() - 1)) == -1 && punctuation.indexOf(word.charAt(word.length() - 1)) == -1) {
            return false;
        }

        if (word.length() > 1 && word.charAt(word.length() - 2) == '-' && punctuation.indexOf(word.charAt(word.length() - 1)) > -1) {
            return false;
        }

        int countHyphen = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (ch == '-') {
                countHyphen++;
                if (countHyphen > 1) {
                    return false;
                }
            } else if (letters.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }


    //If the length of the sentence is, for example, 5
//if we replace all the hyphens in the sentence with "" - I.E an empty space, that reduces the length of the string by 1
//So if we do 5 - 4, we would have 1.
//Similar to if the string had 2 hyphens
//5 - 3 = 2, as the length of the string decreased by 2.
//I.E length > 1
    public static boolean hasMoreThanOneHyphen(String sentence) {
        int t = sentence.length() - sentence.replace("-", "").length();
        return sentence.length() - sentence.replace("-", "").length() > 1;
    }
}
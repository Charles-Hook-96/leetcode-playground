package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//1859. Sorting the Sentence
//TEST DATA: is2 sentence4 This1 a3
public class SortSentenceByAppendedIndex {

    public static String sortSentence(String s) {
        String[] stringArray = s.split(" ");
        Map<Integer, String> stringPosition = new TreeMap<>();
        StringBuilder newString = new StringBuilder();

        for (String string: stringArray) {
            int stringLength = string.length();
            String stringIndex = String.valueOf(string.charAt(stringLength -1));
            stringPosition.put(Integer.valueOf(stringIndex), string);
        }

        for (Map.Entry<Integer, String> map: stringPosition.entrySet()) {
            newString.append(map.getValue(), 0, map.getValue().length() - 1).append(" ");
        }
        return newString.toString().trim();
    }
}
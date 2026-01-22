package org.example.neetcode;

import java.util.*;

//Test Data:
//    String[] strs = new String[] {"act","pots","tops","cat","stop","hat"};
public class GroupAnagram {

    public static List<List<String>> example(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] characters = str.toCharArray();

            Arrays.sort(characters);

            StringBuilder key = new StringBuilder();
            for (char c : characters) {
                key.append(c);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
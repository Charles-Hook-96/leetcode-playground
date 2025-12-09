package org.example;

import java.util.HashMap;
import java.util.Map;

//383. Ransom Note
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazinesCharacters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazinesCharacters.getOrDefault(m, 0);
            magazinesCharacters.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazinesCharacters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazinesCharacters.put(r, currentCount - 1);
        }

        return true;

    }
}
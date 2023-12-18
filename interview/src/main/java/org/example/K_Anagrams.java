package org.example;

import java.util.HashMap;
import java.util.Map;

public class K_Anagrams {
    public static void main(String[] args) {
        areK_Anagram("grammar", "anagram", 3);
        areK_Anagram("geekse", "eggkfz", 1);
    }

    public static void areK_Anagram(String str1, String str2, int k) {
        boolean result = true;
        Map<Character, Integer> counts = new HashMap<>();

        result &= str1.length() == str2.length();

        for (int i = 0; i < str1.length(); i++) {
            counts.put(str1.charAt(i), counts.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            counts.put(str2.charAt(i), counts.getOrDefault(str2.charAt(i), 0) - 1);
        }

        int differences1 = 0;
        int differnces2 = 0;
        for (var count : counts.entrySet()) {
            if (count.getValue() > 0)
                differences1 += count.getValue();
            else
                differnces2 += Math.abs(count.getValue());
        }

        result &= differences1 <= k && differnces2<=k;

        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

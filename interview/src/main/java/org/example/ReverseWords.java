package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String s) {
        String reversed = "";

        String[] words = s.trim().split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(""))
                reversed += words[i] + " ";
        }

        return reversed.trim();
    }
}

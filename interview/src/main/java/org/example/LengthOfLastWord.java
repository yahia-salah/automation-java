package org.example;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length=0;

        String[] splitted = s.trim().split(" ");

        length = splitted[splitted.length-1].length();

        return length;
    }
}

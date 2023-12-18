package org.example;

import java.util.Arrays;

public class RomanNumeralsII {
    public String intToRoman(int num) {
        String roman = "";

        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        while (num != 0) {
            for (int i = romans.length - 1; i >= 0; i--) {
                int division = num / romanNumeral(romans[i]);

                if (division >= 1) {
                    roman+=romans[i];
                    num-=romanNumeral(romans[i]);
                    break;
                }
            }
        }

        return roman;
    }

    private int romanNumeral(String s) {
        switch (s) {
            case "I":
                return 1;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XL":
                return 40;
            case "L":
                return 50;
            case "XC":
                return 90;
            case "C":
                return 100;
            case "CD":
                return 400;
            case "D":
                return 500;
            case "CM":
                return 900;
            case "M":
                return 1000;
        }

        return 0;
    }
}

package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RomanNumerals {
    public int romanToInt(String s) {
        int number = 0;

        char[] chars = s.toCharArray();

        int currentNumeral = romanNumeral(chars[chars.length-1]);
        number+=currentNumeral;

        for (int i=chars.length-1;i>0;i--)
        {
            int nextNumeral = romanNumeral(chars[i-1]);
            if(nextNumeral<currentNumeral)
                number-=nextNumeral;
            else
                number+=nextNumeral;

            currentNumeral=nextNumeral;
        }
        return number;
    }

    private int romanNumeral(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }

        return 0;
    }
}

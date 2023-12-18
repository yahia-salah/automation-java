package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        char result=0;

        for (char c:(s+t).toCharArray()){
            result^=c;
        }

        return result;
    }
}

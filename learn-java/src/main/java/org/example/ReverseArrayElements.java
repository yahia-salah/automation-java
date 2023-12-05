package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayElements {
    public static void main(String[] args){
        String[] source = {"Yahia", "Salah", "Eldin", "Ali"};

        List<String> reversed = new ArrayList<String>();

        for(var i=source.length-1;i>=0;i--){
            reversed.add(source[i]);
        }

        System.out.println("Source: "+ Arrays.asList(source));
        System.out.println("Reversed: "+reversed);
    }
}

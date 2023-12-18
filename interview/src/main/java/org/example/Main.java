package org.example;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        Queue<String> queue = new LinkedList<>();
        Arrays.stream(new Integer[]{}).filter(x->x>0).collect(Collectors.toList());
    }
}
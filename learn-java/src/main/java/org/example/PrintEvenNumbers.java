package org.example;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : input) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListFilterLambda {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "grape", "apricot");

        // Filtering strings that start with the letter 'a'
        List<String> filteredList = stringList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        // Displaying the filtered list
        System.out.println("Filtered List: " + filteredList);
    }
}

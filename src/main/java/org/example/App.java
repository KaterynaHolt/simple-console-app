package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main( String[] args ) {
        System.out.println("Sorted word list: ");
        sortList(args).forEach(x -> System.out.println(x));
    }

    /**
     * Sort array of words
     * @param str Array of words which must be sorted
     * @return List of sorted words
     */
    public static List<String> sortList(String[] str){
        return Arrays.asList(str).stream().sorted().collect(Collectors.toList());
    }
}

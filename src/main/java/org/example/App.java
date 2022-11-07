package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main( String[] args ) {
        System.out.println("Sorted word list: ");
        sortedList(args).forEach(x -> System.out.println(x));
    }

    /**
     * Sort array of words
     * @param str Array of words which must be sorted
     * @return List of sorted words
     */
    public static ArrayList<String> sortedList(String[] str){
        return (ArrayList<String>)Arrays.asList(str).stream().sorted().collect(Collectors.toList());
    }
}

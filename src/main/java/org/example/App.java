package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;

public class App {
    public static void main( String[] args ){
        try{
            validation(args);
            System.out.println("Sorted word list: ");
            sortList(args).forEach(x -> System.out.println(x));
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Sort array of words
     * @param str Array of words which must be sorted
     * @return List of sorted words
     */
    public static List<String> sortList(String[] str) {
        return Arrays.asList(str).stream().sorted().collect(Collectors.toList());
    }

    /**
     * Validate array of parameters
     * @param str Array of parameters which need to validate
     */
    public static void validation(String[] str) throws IllegalArgumentException{
        if(str.length == 0){
            throw new IllegalArgumentException("No parameter passed!");
        }
        else if(str.length == 1) {
            throw new IllegalArgumentException("You passed only one parameter, it must be two or more!");
        }
    }
}

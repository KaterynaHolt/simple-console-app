package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main( String[] args ) {
        System.out.println("Sorted word list: ");
        Arrays.stream(sorted_list(args)).forEach(x -> System.out.println(x));
    }

    public static Object[] sorted_list(String[] str){
        return Arrays.stream(str).sorted().toArray();
    }
}

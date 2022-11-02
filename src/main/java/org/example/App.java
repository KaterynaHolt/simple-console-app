package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

    public class App {
    public static void main( String[] args ) {
        System.out.println("Please enter your words with spaces between them:");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        Stream<String> stream = Arrays.stream(str);
        System.out.println("Sorted word list: ");
        stream.sorted().forEach(x -> System.out.println(x));
        stream.close();
        scanner.close();
    }
}

package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }

    /**
     * Test sorting method - sortedList
     */
    public void testList(){
        String[] data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] ex = {"eight", "five", "four", "nine", "one", "seven", "six", "ten", "three", "two"};
        ArrayList<String> expected = (ArrayList<String>) Arrays.stream(ex).collect(Collectors.toList());
        ArrayList<String> actual = App.sortedList(data);

        Assertions.assertLinesMatch(expected, actual);
    }
}

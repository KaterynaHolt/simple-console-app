package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public void test_should_sort_passed_list(){
        //GIVEN
        String[] data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        List<String> expected = new ArrayList<>(List
                .of("eight", "five", "four", "nine", "one", "seven", "six", "ten", "three", "two"));
        //WHEN
        List<String> actual = App.sortList(data);
        //THEN
        Assertions.assertLinesMatch(expected, actual);
    }
}

package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.List;

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
        List<String> expected = List
                .of("eight", "five", "four", "nine", "one", "seven", "six", "ten", "three", "two");
        //WHEN
        List<String> actual = App.sortList(data);
        //THEN
        Assertions.assertLinesMatch(expected, actual);
    }

    /**
     * Test throwing IllegalArgumentException in method sortedList
     */
    public void test_no_parameter_exception(){
        //GIVEN
        String[] data = {};
        //WHEN
        IllegalArgumentException throwable = Assertions.assertThrows(IllegalArgumentException
                .class, ()-> App.sortList(data));
        //THEN
        Assertions.assertEquals("No parameter passed!", throwable.getMessage());
    }

    /**
     * Test message that method sortedList was passed only one parameter
     */
    public void test_one_element_exception(){
        //GIVEN
        String[] data = {"one"};
        List<String> expected = List
                .of("You passed only one parameter, it must be two or more!");
        //WHEN
        List<String> actual = App.sortList(data);
        //THEN
        Assertions.assertLinesMatch(expected, actual);
    }
}

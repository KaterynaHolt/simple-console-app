package org.example;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void testList(){
        String[] data = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] expected = {"eight", "five", "four", "nine", "one", "seven", "six", "ten", "three", "two"};
        Object[] actual = App.sorted_list(data);

        Iterator<String> ex = Arrays.stream(expected).iterator();
        Iterator<Object> ac = Arrays.stream(actual).iterator();
        while(ex.hasNext() && ac.hasNext()){
            assertEquals(ex.next(), ac.next());
        }
        assert !ex.hasNext() && !ac.hasNext();
    }
}

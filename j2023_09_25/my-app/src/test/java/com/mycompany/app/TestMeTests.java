package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {

        TestMe testMe;

        @Before
        public void setUp() throws Exception {
                testMe  = new TestMe();
    }

        @Test
        public void squareTest() {

                double baseValue = 3.0;
                double expected = baseValue*baseValue;
                testMe.setValue(3.0);
                double actual = testMe.square();

                assertTrue(actual == expected);
        }
        @Test
    public void getValueTest() {

        testMe.setValue(8.0);

        double actual = testMe.getValue();

        assertEquals(8.0, actual, 0.0001);
    }
        @Test
    public void incrementTest() {
        testMe.setValue(5.0);
        testMe.increment();
        assertEquals(6.0, testMe.getValue(), 0.0001);
    }
     @Test
    public void decrementTest() {
        testMe.setValue(7.0);
        testMe.decrement();
        assertEquals(6.0, testMe.getValue(), 0.0001);
    }

}

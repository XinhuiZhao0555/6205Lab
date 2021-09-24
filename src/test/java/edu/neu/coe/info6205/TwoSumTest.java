package edu.neu.coe.info6205;

import static org.junit.Assert.*;

public class TwoSumTest {

    @org.junit.Test
    public void testToString() {

        final TwoSum target = new TwoSum(10);
        final String s = target.toString();
        assertEquals("TwoSum{n=10}",s);
    }
}
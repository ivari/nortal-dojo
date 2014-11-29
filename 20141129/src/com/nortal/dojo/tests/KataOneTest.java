package com.nortal.dojo.tests;

import com.nortal.dojo.KataHelper;
import com.nortal.dojo.KataOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KataOneTest {

    @Test
    public void testReadFile() throws Exception {
        Assert.assertNotEquals(0, KataHelper.getYearStatistics().size());
    }

    @Test
    public void testCalculation() throws Exception{
        KataOne kata = new KataOne();
        assertEquals(0.5, kata.calculateBoysPercentage(5, 5), 0.01);
    }

    @Test
    public void testFindMax() throws Exception{
        KataOne kata = new KataOne();
        List<String> birthStats = Arrays.asList("2011;10;10","2012;5;10","2013;15;10","2014;3;10");
        assertEquals(new Integer(2013), kata.getMax(birthStats));
    }
}
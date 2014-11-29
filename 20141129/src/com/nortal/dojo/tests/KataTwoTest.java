package com.nortal.dojo.tests;

import com.nortal.dojo.FootballTeam;
import com.nortal.dojo.KataTwo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KataTwoTest {

    @Test
    public void testCalculateGoalDifference() throws Exception {
        assertEquals(4, KataTwo.calculateDifference(10, 6));
        assertEquals(-2, KataTwo.calculateDifference(2, 4));
    }

    @Test
    public void testGetWorstTeam() {
        List<FootballTeam> testData = Arrays.asList(FootballTeam.build("16\tAston Villa\t12\t3\t3\t6\t6\t17"), FootballTeam.build(
                "17\tHull City\t12\t2\t5\t5\t14\t17"));
        assertEquals("Aston Villa", KataTwo.getWorstTeam(testData));
    }

}
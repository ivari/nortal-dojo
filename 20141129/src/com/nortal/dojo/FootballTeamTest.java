package com.nortal.dojo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTeamTest {

    FootballTeam team;

    @Before
    public void beforeTest() {
        team = new FootballTeam("10\tTottenham Hotspur\t12\t5\t2\t5\t16\t17");
    }

    @Test
    public void testConstructor() {
        assertEquals("Tottenham Hotspur", team.getTeamName());
        assertEquals(16, team.getGoalsFor());
        assertEquals(17, team.getGoalsAgainst());
    }

    @Test
    public void testGetGoalDifference() {
        assertEquals(-1, team.getGoalDifference());
    }

}
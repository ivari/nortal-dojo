package com.nortal.dojo;

import java.util.List;

/**
 * Created by lars on 29/11/14.
 */
public class KataTwo {

    private static final String SEPARATOR = "\t";

    public static int calculateDifference(int goalsFor, int goalsAgainst) {
        return goalsFor - goalsAgainst;
    }

    // 11	Stoke City	12	4	3	5	13	15
    public static String getWorstTeam(List<FootballTeam> testData) {
        Integer worst = null;
        String worstTeam = null;

        for (FootballTeam teamStats : testData) {
            try {
                String name = teamStats.getTeamName();
                int goalDifference = teamStats.getGoalDifference();
                if (worst == null || goalDifference < worst) {
                    worst = goalDifference;
                    worstTeam = name;
                }
            } catch (Exception e) {

            }
        }
        return worstTeam;
    }

    public static String getAnswer() {
        List<FootballTeam> teamData = KataHelper.getTeams();
        return getWorstTeam(teamData);
    }

    public static String getCachedAnswer() {
        KataHelper.getTeams();
        return FootballTeam.getWorstTeam().getTeamName();
    }
}

package com.nortal.dojo;

/**
 * Created by lars on 29/11/14.
 */
public class FootballTeam extends KataData {

    private String name;
    private int goalsFor;
    private int goalsAgainst;

    private int goalDifference;
    private static FootballTeam worstTeam;
    private static Integer worstDifference;

    public static FootballTeam build(String input) {
        return new FootballTeam(input);
    }

    public FootballTeam(String lineFromFile){
        String[] split = lineFromFile.split("\t");
        this.name = split[1];
        this.goalsFor = Integer.valueOf(split[6]);
        this.goalsAgainst = Integer.valueOf(split[7]);
        updateGoalDifference();
        updateWorst();
    }

    public String getTeamName() {
        return name;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public static FootballTeam getWorstTeam() {
        return worstTeam;
    }

    private void updateGoalDifference() {
        goalDifference = goalsFor - goalsAgainst;
    }

    private void updateWorst() {
        if (worstDifference == null || getGoalDifference() < worstDifference) {
            worstDifference = getGoalDifference();
            worstTeam = this;
        }
    }
}

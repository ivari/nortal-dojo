package com.nortal.dojo;

import java.util.List;

/**
 * Created by lars on 29/11/14.
 */
public class KataOne {

    public static double calculateBoysPercentage(int boys, int girls)  {
        return (double)boys / (boys + girls);
    }

    public static Integer getMax(List<String> birthStats) {
        Integer year = null;
        double maximum = 0;
        for (String yearStats : birthStats) {
            String[] stats = yearStats.split(";");
            try {
                int currentYear = Integer.valueOf(stats[0]);
                double boysPercentage = calculateBoysPercentage(Integer.valueOf(stats[1]), Integer.valueOf(stats[2]));
                if (maximum < boysPercentage) {
                    maximum = boysPercentage;
                    year = currentYear;
                }
            } catch (Exception e) {}
        }
        return year;
    }

    public static String getAnswer() {
        List<String> data = KataHelper.getYearStatistics();
        return String.valueOf(getMax(data));
    }
}

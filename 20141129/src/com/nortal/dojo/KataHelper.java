package com.nortal.dojo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lars and ivari on 29/11/14.
 */
public class KataHelper {

    public static List<FootballTeam> getTeams() {
        List<FootballTeam> result = new ArrayList<FootballTeam>();
        for (String line : readFile("soccer")) {
            try {
                result.add(FootballTeam.build(line));
            } catch (Exception e) {
            }
        }
        return result;
    }

    private static List<String> readFile(String fileName) {

        List<String> result = new ArrayList<String>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName + ".dat"));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                result.add(currentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static List<String> getYearStatistics() {
        return readFile("births");
    }
}

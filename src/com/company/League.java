package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String name;
    private int points;

    private ArrayList<T> leagues = new ArrayList<T>();

    public League(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean add(T team) {
        if (!this.leagues.contains(team)) {
            this.leagues.add(team);
            System.out.println("Team: " + team.getName() + " added");
            return false;
        } else {
            System.out.println("Team: " + team.getName() + " is already added");
            return true;
        }

    }

    public void showLegaueTable() {
        Collections.sort(leagues);

        for (T t : leagues) {
            System.out.println("Team name: " + t.getName() + " Ranking: " + t.ranking());
        }
    }
}

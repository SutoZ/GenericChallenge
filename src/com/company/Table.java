package com.company;

import java.util.List;

public class Table <T extends League> {

    private String name;
    private int points;

    private List<League> leagues;

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public Table(String name, int points) {
        this.name = name;
        this.points = points;
    }
}

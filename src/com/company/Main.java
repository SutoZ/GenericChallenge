package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootBallPlayer>> footballLeague = new League<Team<FootBallPlayer>>("AFK", 4);
        Team<FootBallPlayer> ute = new Team<FootBallPlayer>("ute");
        Team<FootBallPlayer> fradi = new Team<FootBallPlayer>("fradi");
        Team<FootBallPlayer> vasas = new Team<FootBallPlayer>("vasas");

        footballLeague.add(ute);
        footballLeague.add(ute);
        footballLeague.add(ute);
        footballLeague.add(fradi);
        footballLeague.add(vasas);

        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("baseballll");
        //footballLeague.add(baseballTeam);

        ute.matchResult(fradi,4,1);
        ute.matchResult(vasas,3,3);


        footballLeague.showLegaueTable();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        //Initializing new football league
        League <Team<FootballPlayer>> footBallLeague = new League<>("Jalkapallo Liiga");

        //Initializing football teams
        Team<FootballPlayer> jyp = new Team<>("JYP");
        Team<FootballPlayer> oulu = new Team<>("Oulu");
        Team<FootballPlayer> turku = new Team<>("Turku");
        Team<FootballPlayer> kuopio = new Team<>("Kuopio");
        //Initializing baseball team
        Team<BaseballPlayer> baseballTeam = new Team<>("Mailapojat");

        //Adding teams to the football league array list
        footBallLeague.add(jyp);
        footBallLeague.add(oulu);
        footBallLeague.add(turku);
        footBallLeague.add(kuopio);
        //Cannot add baseball team to the league because it is type restricted
        //footBallLeague.add(baseballTeam);

        //Adding results
        turku.matchResult(kuopio, 1, 0);
        turku.matchResult(jyp, 1, 3);
        jyp.matchResult(kuopio, 4, 2);

        //Prints out teams and rankings
        footBallLeague.showLeague();
    }
}

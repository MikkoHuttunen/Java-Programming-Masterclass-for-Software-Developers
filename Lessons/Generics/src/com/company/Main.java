package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Mikko");
        items.add(4);
        items.add(5);

        printDoubled(items);
        System.out.println("********************");

        FootballPlayer timo = new FootballPlayer("Timo");
        BaseballPlayer juha = new BaseballPlayer("Juha");
        SoccerPlayer matti = new SoccerPlayer("Matti");

        Team<FootballPlayer> jyp = new Team<>("JYP");
        jyp.addPlayer(timo);
        System.out.println(jyp.numPlayers());
        Team<BaseballPlayer> hjk = new Team<>("HJK");
        hjk.addPlayer(juha);
        Team<SoccerPlayer> myp = new Team<>("MYP");
        myp.addPlayer(matti);

        Team<FootballPlayer> oulu = new Team<>("Oulu");
        FootballPlayer heikki = new FootballPlayer("Heikki");
        oulu.addPlayer(heikki);

        Team<FootballPlayer> turku = new Team<>("Turku");
        Team<FootballPlayer> kuopio = new Team<>("Kuopio");

        turku.matchResult(kuopio, 1, 0);
        turku.matchResult(jyp, 1, 3);
        jyp.matchResult(kuopio, 4, 2);
        //jyp.matchResult(hjk, 1, 1);

        System.out.println("Rankings");
        System.out.println(jyp.getName() + ": " + jyp.ranking());
        System.out.println(hjk.getName() + ": " + hjk.ranking());
        System.out.println(myp.getName() + ": " + myp.ranking());
        System.out.println(oulu.getName() + ": " + oulu.ranking());
        System.out.println(turku.getName() + ": " + turku.ranking());
        System.out.println(kuopio.getName() + ": " + kuopio.ranking());

        System.out.println(jyp.compareTo(oulu));
        System.out.println(jyp.compareTo(turku));
        System.out.println(kuopio.compareTo(turku));
        System.out.println(oulu.compareTo(kuopio));
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}

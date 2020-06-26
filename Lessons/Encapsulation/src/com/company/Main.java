package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Player player = new Player();
        player.fullName = "Mikko";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
         */

        EnhancedPlayer player = new EnhancedPlayer("Mikko", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        //Challenge

        //Create new class for printer and demonstrate encapsulation

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.print(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.print(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}

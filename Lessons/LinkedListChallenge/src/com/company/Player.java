package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private ArrayList<Album> albums;

    public Player() {
        this.albums = new ArrayList<Album>();
    }

    public static void usePlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter:");
        System.out.println("\t0 - To quit");
        System.out.println("\t1 - To play next song");
        System.out.println("\t2 - To play previous song");
        System.out.println("\t3 - To show playlist");
        System.out.println("\t4 - To show menu options");
        int action = scanner.nextInt();
        scanner.nextLine();
    }
}

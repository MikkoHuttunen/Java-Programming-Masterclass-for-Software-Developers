package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    //Another main method
    public static void main(String[] args) {

        //Initializing new LinkedList
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Helsinki");
        addInOrder(placesToVisit, "Rome");
        addInOrder(placesToVisit, "Berlin");
        addInOrder(placesToVisit, "Paris");
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "Hong Kong");
        addInOrder(placesToVisit, "Tokyo");
        addInOrder(placesToVisit, "Seoul");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Paris"); //Is duplicate
        addInOrder(placesToVisit, "Stockholm");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    //Print LinkedList
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator(); //Iterates through linkedList
        //While there is entries
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next()); //.next moves to the next entry
        }
        System.out.println("********************");
    }

    //Sort items of linked list in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newDestination) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); //Iterates through linkedList
        while (stringListIterator.hasNext()) {
            //Compare linkedList value to parameter value
            int comparison = stringListIterator.next().compareTo(newDestination);
            if (comparison == 0) {
                //Equal, do not add
                System.out.println(newDestination + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //Destination should appear before this one
                stringListIterator.previous(); //Return to previous entry
                stringListIterator.add(newDestination);
                return true;
            } else if (comparison < 0){
                //Move to the next destination
            }
        }

        stringListIterator.add(newDestination);
        return true;
    }

    //Move next and previous destinations
    private static void visit(LinkedList destinations) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = destinations.listIterator();

        if (destinations.getFirst() == "") {
            System.out.println("No destinations found in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    printMenu();
                    break;
            }
        }
    }

    //Print out menu options
    public static void printMenu() {
        System.out.println("Enter:");
        System.out.println("\t0 - To quit");
        System.out.println("\t1 - To visit next destination");
        System.out.println("\t2 - To visit previous destination");
        System.out.println("\t3 - To show options");
    }
}

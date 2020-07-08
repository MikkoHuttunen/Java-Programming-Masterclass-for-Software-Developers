package com.company;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void start() {
        boolean quit = false;
        int choice;

        printInstructions(); //Print instructions to user
        while (!quit) {
            System.out.println("Enter your action:");
            choice = scanner.nextInt();
            scanner.nextLine();

            //Functions
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    printInstructions();
                    break;
            }
        }
    }

    //Print out all the functions
    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t0 - To show instructions.");
        System.out.println("\t1 - To show contacts");
        System.out.println("\t2 - To add contact");
        System.out.println("\t3 - To modify contact");
        System.out.println("\t4 - To remove contact");
        System.out.println("\t5 - To find contact");
        System.out.println("\t6 - To quit");
    }

    //Add new contact information
    public static void addContact() {
        System.out.println("Enter contact name and phone number:");
        contacts.addContact(scanner.nextLine());
    }

    //Modify existing contact
    public static void modifyContact() {
        System.out.println("Enter contact name you want to modify:");
        String currentContact = scanner.nextLine();
        System.out.println("Enter new contact information:");
        String newContact = scanner.nextLine();
        contacts.modifyContact(currentContact, newContact);
        System.out.println("Contact information has been changed");
    }

    //Remove contact information
    public static void removeContact() {
        System.out.println("Enter contact name you want to remove:");
        contacts.removeContact(scanner.nextLine());
        System.out.println("Contact information has been deleted");
    }

    //Find contact information
    public static void findContact() {
        System.out.println("Enter contact name to find:");
        String searchContact = scanner.nextLine();
        if (contacts.OnContacts(searchContact)) {
            System.out.println("Found " + searchContact);
        } else {
            System.out.println(searchContact + " not found.");
        }
    }
}

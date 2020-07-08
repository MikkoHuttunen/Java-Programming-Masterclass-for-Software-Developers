package com.company;

import java.util.ArrayList;

public class Contacts {

    //Initialize new array list containing all contact information
    private ArrayList<String> contacts = new ArrayList<String>();

    public void showContacts() {
        for(int i=0; i< contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    public void addContact(String contact) {
        contacts.add(contact);
    }

    public void modifyContact(String currentContact, String newContact) {
        int position = findContact(currentContact);
        if (position >= 0) {
            modifyContact(position, newContact);
        }
    }

    //Private overload method for modifying to handle position in the array list
    private void modifyContact(int position, String newContact) {
        contacts.set(position, newContact);
    }

    public void removeContact(String contact) {
        int position = findContact(contact);
        if (position >= 0) {
            removeContact(position);
        }
    }

    //Private overload method for removing to handle position in the array list
    private void removeContact(int position) {
        contacts.remove(position);
    }

    //Private method to find contact from array list
    private int findContact(String contact) {
        return contacts.indexOf(contact);
    }

    //Checks if contact exists in array list
    public boolean OnContacts(String contact) {
        int position = findContact(contact);
        if (position >= 0) {
            return true;
        }

        return false;
    }
}

package com.ashu.ARRLISTC;

import com.ashu.ARRLISTC.Contact;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact c) {
        if (findContact(c.getName()) >= 0) {
            System.out.println("The contact is in your contacts list.");
            return false;
        }
        myContacts.add(c);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println("Contact was removed successfully.");
        return true;
    }

    private int findContact(Contact c) {
        return this.myContacts.indexOf(c);
    }

    private int findContact(String s) {
        int y = 0;
        for (var x : myContacts) {
            if (x.equals(s)) {
                return myContacts.indexOf(s);
            } else {
                y = -1;
            }
            return y;

        }
        return -1;
    }

    public Contact queryContact(String s) {
        int position = findContact(s);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("You have " + myContacts.size() + " contacts in your contacts list.");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + " " + myContacts.get(i).getName() + " - " + myContacts.get(i).getPhoneNumber());
        }
    }

}
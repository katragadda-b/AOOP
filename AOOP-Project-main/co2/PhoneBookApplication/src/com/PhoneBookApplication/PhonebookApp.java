package com.PhoneBookApplication;

import java.util.Scanner;
import java.util.Set;

public class PhonebookApp {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Phonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact by Name");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addContact(name, phoneNumber);
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    name = scanner.nextLine();
                    Set<Contact> contacts = phonebook.searchContactByName(name);
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found for: " + name);
                    } else {
                        System.out.println("Contacts for " + name + ": " + contacts);
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Remove: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Phone Number to Remove: ");
                    phoneNumber = scanner.nextLine();
                    phonebook.removeContact(name, phoneNumber);
                    break;

                case 4:
                    phonebook.displayAllContacts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}

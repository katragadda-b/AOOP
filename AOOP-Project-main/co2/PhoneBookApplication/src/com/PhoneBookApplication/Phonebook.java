package com.PhoneBookApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, Set<Contact>> phonebookMap;

    public Phonebook() {
        this.phonebookMap = new HashMap<>();
    }

    
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        phonebookMap.putIfAbsent(name, new HashSet<>());
        phonebookMap.get(name).add(contact);
        System.out.println("Contact added: " + contact);
    }

    
    public Set<Contact> searchContactByName(String name) {
        return phonebookMap.getOrDefault(name, new HashSet<>());
    }

   
    public void removeContact(String name, String phoneNumber) {
        Set<Contact> contacts = phonebookMap.get(name);
        if (contacts != null) {
            contacts.remove(new Contact(name, phoneNumber));
            if (contacts.isEmpty()) {
                phonebookMap.remove(name);
            }
            System.out.println("Removed contact: " + name + " " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    
    public void displayAllContacts() {
        if (phonebookMap.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Map.Entry<String, Set<Contact>> entry : phonebookMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + " - Contacts: " + entry.getValue());
            }
        }
    }
}

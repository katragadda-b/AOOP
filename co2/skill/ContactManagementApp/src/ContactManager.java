
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class ContactManager {
	private Set<Contact> contacts;
    private Map<String, Contact> contactMap;
    public ContactManager() {
        contacts = new HashSet<>();
        contactMap = new HashMap<>();
    }
    public void addContact(Contact contact) {
        if (contacts.add(contact)) {
            contactMap.put(contact.getName(), contact);
            System.out.println("Contact added: " + contact.getName());
        } else {
            System.out.println("Contact already exists with phone number: " + contact.getPhoneNumber());
        }
    }
    public Contact getContactByName(String name) {
        return contactMap.get(name);
    }
    public void listContacts() {
        System.out.println("Contact List:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

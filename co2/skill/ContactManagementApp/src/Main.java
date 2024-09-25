
public class Main {

	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
        Contact contact1 = new Contact("Alice", "123-456-7890", "alice@example.com");
        Contact contact2 = new Contact("Bob", "987-654-3210", "bob@example.com");
        Contact contact3 = new Contact("Charlie", "123-456-7890", "charlie@example.com");
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3); 
        contactManager.listContacts();
        Contact retrievedContact = contactManager.getContactByName("Alice");
        System.out.println("Retrieved Contact: " + retrievedContact);
	}
}
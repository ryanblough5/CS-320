/************
 * Ryan Blough
 * 
 * CS - 320 Module Six Project
 */

package contact;

import java.util.ArrayList;

public class ContactService {
	// Create an array list to store the list of contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Display the full list of contacts to the console to check for errors
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t ContactID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getPhone());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}
	
	// Adding a new contact using the Contact constructor, then assigns the new contact to the Array List
	public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		contactList.add(contact);
	}
	
	// If a matching contact detail is not found, return contact details with the preset default values
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	
	// Deleting a new contact using the Contact constructor, then deletes the new contact to the Array List
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)){
				contactList.remove(counter);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found");
			}
		}
	}
	// Updating a contact using the Contact constructor, then updates appropriate information
	// Update the first name
	public void updateFirstName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setFirstName(updatedString);
				break;
			}
			if (counter == contactList.size() -1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	// Update the last name
	public void updateLastName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setLastName(updatedString);
				break;
			}
			if (counter == contactList.size() -1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	// Update the phone number
	public void updatePhone(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setPhone(updatedString);
				break;
			}
			if (counter == contactList.size() -1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	// Update the address
	public void updateAddress(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setAddress(updatedString);
				break;
			}
			if (counter == contactList.size() -1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
}

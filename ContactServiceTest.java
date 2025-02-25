/***
 * Ryan Blough
 * 
 * CS-320 Module Six Project
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import contact.ContactService;
import contact.Contact;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.displayContactList();
		assertNotNull(service.getContact("0123456789"), "Contact was not added correctly");
	}
	
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.deleteContact("0123456789");
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted");
	}

	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.updateFirstName("Steve", "0123456789");
		service.displayContactList();
		assertEquals("Steve", service.getContact("0123456789").getFirstName(), "First name was not updated");
	}
	
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.updateLastName("Smith", "0123456789");
		service.displayContactList();
		assertEquals("Smith", service.getContact("0123456789").getLastName(), "Last name was not updated");
	}
	
	@Test
	void testUpdatePhone() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.updatePhone("5555555555", "0123456789");
		service.displayContactList();
		assertEquals("5555555555", service.getContact("0123456789").getPhone(), "Phone number was not updated");
	}
	
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("0123456789", "Ryan", "Blough", "9999999999", "101 Cherry Lane");
		service.updateAddress("1005 Main St", "0123456789");
		service.displayContactList();
		assertEquals("1005 Main St", service.getContact("0123456789").getAddress(), "Address was not updated");
	}
}

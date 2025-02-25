/****
 * Ryan Blough
 * 
 * CS-320 Module Six Project
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import contact.Contact;

class ContactTest {
	
	@Test
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", "Address");
		if(contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters");
		}
	}
	
	@Test
	void testFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", "Address");
		if(contact.getFirstName().length() > 10) {
			fail("First name has more than 10 characters");
		}
	}
	
	@Test
	void testLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", "Address");
		if(contact.getLastName().length() > 10) {
			fail("Last name has more than 10 characters");
		}
	}
	
	@Test
	void testPhoneNumberIsExactlyTenCharacters() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", "Address");
		if(contact.getPhone().length() > 10) {
			fail("Phone number is not exactly 10 characters");
		}
	}
	
	@Test
	void testAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", "Address");
		if(contact.getAddress().length() > 10) {
			fail("Address has more than 30 characters");
		}
	}
	
	@Test
	void testContactIDNotNull() {
		Contact contact = new Contact(null, "FirstName", "LastName", "Phone", "Address");
		assertNotNull(contact.getContactID(), "Contact ID was null");
	}
	
	@Test
	void testFirstNameNotNull() {
		Contact contact = new Contact("0123456789", null, "LastName", "Phone", "Address");
		assertNotNull(contact.getFirstName(), "First name was null");
	}
	
	@Test
	void testLastNameNotNull() {
		Contact contact = new Contact("0123456789", "FirstName", null, "Phone", "Address");
		assertNotNull(contact.getLastName(), "Last name was null");
	}
	
	@Test
	void testPhoneNotNull() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", null, "Address");
		assertNotNull(contact.getPhone(), "Phone number was null");
	}
	
	@Test
	void testAddressNotNull() {
		Contact contact = new Contact("0123456789", "FirstName", "LastName", "Phone", null);
		assertNotNull(contact.getAddress(), "Address was null");
	}
}
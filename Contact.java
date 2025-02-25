/***************
 * Ryan Blough
 * 
 * CS - 320 Module Six Project
 */

package contact;

import java.util.concurrent.atomic.AtomicLong;

// Define the contact class variables
public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	// Create the constructor for the contact details
	/*
	 * The constructor generates a new ID for the contactID field
	 * Taking the first and last name, phone number and address of the contact
	 * 
	 */
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		this.contactID = String.valueOf(idGenerator.getAndIncrement());

		// First Name
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
		
		// Last Name
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		// Phone Number
		if (phone == null || phone.isEmpty() || phone.length() != 10) {
			this.phone = "9999999999";
		} else {
			this.phone = phone;
		}
		
		// Address
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
	
	// Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters (follows the same rules as the constructor does)
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}
	public void setPhone(String phone) {
		if (phone == null || phone.isEmpty() || phone.length() != 10) {
			this.phone = "9999999999";
		} else {
			this.phone = phone;
		}
	}
	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
}

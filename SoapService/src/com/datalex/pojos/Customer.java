package com.datalex.pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
public class Customer {
	private String CustomerDocID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(String CustomerDocID, String firstName, String lastName, String email, String phone) {
        this.CustomerDocID = CustomerDocID;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone; 
        
    }

    
    public String getCustomerDocID() {
		return CustomerDocID;
	}

	public void setCustomerDocID(String customerDocID) {
		CustomerDocID = customerDocID;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

	@Override
	public String toString() {
		return "Customer [CustomerDocID=" + CustomerDocID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	

    
}

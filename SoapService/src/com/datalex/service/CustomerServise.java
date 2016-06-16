package com.datalex.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jdom.JDOMException;

import com.datalex.dao.DAOFactory;
import com.datalex.dao.IDAO;
import com.datalex.pojos.Customer;



@WebService(serviceName = "CustomerServise")
public class CustomerServise {
private List<Customer> customers;	
	
	{	customers = new ArrayList<Customer>();	
		IDAO dao = DAOFactory.getInstance();		
		Customer customer = null;
		
			try {
				customer = dao.getCustomer("0004257753.xml");
			} catch (IOException | JDOMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			customers.add(customer);
	}
	@WebMethod(operationName = "getCustomers")
	public List<Customer> getCustomers(){					
		return customers;
	}	
	
	@WebMethod(operationName = "findMessageById")
	public Customer findMessageById(String id) {
		for (Customer customer : customers) {
			if (customer.getCustomerDocID().equals(id)) {
				return customer;
			}
		}
		return null;
	}
	
	@WebMethod(operationName = "deleteMessageById")
	public boolean deleteMessageById(String id) {
		boolean result = false;		
		for (Customer customer : customers) {
			if (customer.getCustomerDocID().equals(id)) {
				result = customers.remove(customer);
				return result;
			}
		}
		return result;
	}
	
	@WebMethod(operationName = "updateMessage")
	public boolean updateMessage(Customer customer) {
		boolean result = false;
		
		for (Customer temp: customers) {
			if (temp.getCustomerDocID().equals(customer.getCustomerDocID())) {
				temp.setFirstName(customer.getFirstName());
				temp.setLastName(customer.getLastName());
				result = true;
			}
		}
		return result;
	}
	
	@WebMethod(operationName = "addMesage")
	public boolean addMesage(Customer customer) {
		
		return customers.add(customer);
	}
		
}

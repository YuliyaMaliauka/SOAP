package runers;

import java.util.List;

import com.datalex.service.Customer;
import com.datalex.service.CustomerServise;
import com.datalex.service.CustomerServise_Service;


public class Main {

	public static void main(String[] args) {
		CustomerServise webservice = new CustomerServise_Service().getCustomerServisePort();
		List<Customer> empl = webservice.getCustomers();
		for (Customer customer : empl) {
		System.out.println(customer.getCustomerDocID());}
		Customer castomer = webservice.findMessageById("RESV_RETRIEVE_Customer1850432");
		System.out.println(castomer.getFirstName());				
	}	
}

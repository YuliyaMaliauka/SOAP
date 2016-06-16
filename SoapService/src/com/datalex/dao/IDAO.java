package com.datalex.dao; 

import java.io.IOException;
import org.jdom.JDOMException;

import com.datalex.pojos.Customer;

public interface IDAO {
   
    Customer getCustomer(String file) throws IOException,JDOMException;
    
}

package com.datalex.dao;


import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import com.datalex.pojos.Customer;

import org.jdom.Namespace;

public class DaoXML implements IDAO {

    private final Namespace NAMESPACE = Namespace.getNamespace("urn:reservation.rqrs.datalex.com");

    private Element rootElement(String xmlFileName) throws IOException, JDOMException {

        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build(xmlFileName);
        Element root = document.getRootElement();

        return root;
    }
  

    @Override
    public Customer getCustomer(String xmlFileName) throws IOException, JDOMException {
        Element root = rootElement(xmlFileName);
        Customer customer = new Customer();
        Element cusElement = root.getChild("Customer", NAMESPACE);
        customer.setFirstName(cusElement.getAttributeValue("FirstName"));
        customer.setLastName(cusElement.getAttributeValue("LastName"));
        customer.setCustomerDocID(cusElement.getAttributeValue("CustomerDocID"));
        customer.setPhone(cusElement.getChild("Phone", NAMESPACE).getAttributeValue("PhoneNumber"));
        customer.setEmail(cusElement.getChild("Email", NAMESPACE).getAttributeValue("EmailAddress"));
        
        return customer;
    }

    
}

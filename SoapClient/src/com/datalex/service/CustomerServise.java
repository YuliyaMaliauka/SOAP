
package com.datalex.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerServise", targetNamespace = "http://service.datalex.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerServise {


    /**
     * 
     * @return
     *     returns java.util.List<com.datalex.service.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomers", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.GetCustomers")
    @ResponseWrapper(localName = "getCustomersResponse", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.GetCustomersResponse")
    @Action(input = "http://service.datalex.com/CustomerServise/getCustomersRequest", output = "http://service.datalex.com/CustomerServise/getCustomersResponse")
    public List<Customer> getCustomers();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.datalex.service.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMessageById", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.FindMessageById")
    @ResponseWrapper(localName = "findMessageByIdResponse", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.FindMessageByIdResponse")
    @Action(input = "http://service.datalex.com/CustomerServise/findMessageByIdRequest", output = "http://service.datalex.com/CustomerServise/findMessageByIdResponse")
    public Customer findMessageById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMessage", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.UpdateMessage")
    @ResponseWrapper(localName = "updateMessageResponse", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.UpdateMessageResponse")
    @Action(input = "http://service.datalex.com/CustomerServise/updateMessageRequest", output = "http://service.datalex.com/CustomerServise/updateMessageResponse")
    public boolean updateMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMesage", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.AddMesage")
    @ResponseWrapper(localName = "addMesageResponse", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.AddMesageResponse")
    @Action(input = "http://service.datalex.com/CustomerServise/addMesageRequest", output = "http://service.datalex.com/CustomerServise/addMesageResponse")
    public boolean addMesage(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMessageById", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.DeleteMessageById")
    @ResponseWrapper(localName = "deleteMessageByIdResponse", targetNamespace = "http://service.datalex.com/", className = "com.datalex.service.DeleteMessageByIdResponse")
    @Action(input = "http://service.datalex.com/CustomerServise/deleteMessageByIdRequest", output = "http://service.datalex.com/CustomerServise/deleteMessageByIdResponse")
    public boolean deleteMessageById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
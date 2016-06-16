
package com.datalex.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.datalex.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindMessageByIdResponse_QNAME = new QName("http://service.datalex.com/", "findMessageByIdResponse");
    private final static QName _GetCustomers_QNAME = new QName("http://service.datalex.com/", "getCustomers");
    private final static QName _Customer_QNAME = new QName("http://service.datalex.com/", "Customer");
    private final static QName _DeleteMessageByIdResponse_QNAME = new QName("http://service.datalex.com/", "deleteMessageByIdResponse");
    private final static QName _AddMesageResponse_QNAME = new QName("http://service.datalex.com/", "addMesageResponse");
    private final static QName _GetCustomersResponse_QNAME = new QName("http://service.datalex.com/", "getCustomersResponse");
    private final static QName _UpdateMessageResponse_QNAME = new QName("http://service.datalex.com/", "updateMessageResponse");
    private final static QName _UpdateMessage_QNAME = new QName("http://service.datalex.com/", "updateMessage");
    private final static QName _FindMessageById_QNAME = new QName("http://service.datalex.com/", "findMessageById");
    private final static QName _DeleteMessageById_QNAME = new QName("http://service.datalex.com/", "deleteMessageById");
    private final static QName _AddMesage_QNAME = new QName("http://service.datalex.com/", "addMesage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.datalex.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMesageResponse }
     * 
     */
    public AddMesageResponse createAddMesageResponse() {
        return new AddMesageResponse();
    }

    /**
     * Create an instance of {@link GetCustomersResponse }
     * 
     */
    public GetCustomersResponse createGetCustomersResponse() {
        return new GetCustomersResponse();
    }

    /**
     * Create an instance of {@link UpdateMessageResponse }
     * 
     */
    public UpdateMessageResponse createUpdateMessageResponse() {
        return new UpdateMessageResponse();
    }

    /**
     * Create an instance of {@link FindMessageByIdResponse }
     * 
     */
    public FindMessageByIdResponse createFindMessageByIdResponse() {
        return new FindMessageByIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomers }
     * 
     */
    public GetCustomers createGetCustomers() {
        return new GetCustomers();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link DeleteMessageByIdResponse }
     * 
     */
    public DeleteMessageByIdResponse createDeleteMessageByIdResponse() {
        return new DeleteMessageByIdResponse();
    }

    /**
     * Create an instance of {@link AddMesage }
     * 
     */
    public AddMesage createAddMesage() {
        return new AddMesage();
    }

    /**
     * Create an instance of {@link DeleteMessageById }
     * 
     */
    public DeleteMessageById createDeleteMessageById() {
        return new DeleteMessageById();
    }

    /**
     * Create an instance of {@link FindMessageById }
     * 
     */
    public FindMessageById createFindMessageById() {
        return new FindMessageById();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "findMessageByIdResponse")
    public JAXBElement<FindMessageByIdResponse> createFindMessageByIdResponse(FindMessageByIdResponse value) {
        return new JAXBElement<FindMessageByIdResponse>(_FindMessageByIdResponse_QNAME, FindMessageByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "getCustomers")
    public JAXBElement<GetCustomers> createGetCustomers(GetCustomers value) {
        return new JAXBElement<GetCustomers>(_GetCustomers_QNAME, GetCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessageByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "deleteMessageByIdResponse")
    public JAXBElement<DeleteMessageByIdResponse> createDeleteMessageByIdResponse(DeleteMessageByIdResponse value) {
        return new JAXBElement<DeleteMessageByIdResponse>(_DeleteMessageByIdResponse_QNAME, DeleteMessageByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMesageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "addMesageResponse")
    public JAXBElement<AddMesageResponse> createAddMesageResponse(AddMesageResponse value) {
        return new JAXBElement<AddMesageResponse>(_AddMesageResponse_QNAME, AddMesageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "getCustomersResponse")
    public JAXBElement<GetCustomersResponse> createGetCustomersResponse(GetCustomersResponse value) {
        return new JAXBElement<GetCustomersResponse>(_GetCustomersResponse_QNAME, GetCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "updateMessageResponse")
    public JAXBElement<UpdateMessageResponse> createUpdateMessageResponse(UpdateMessageResponse value) {
        return new JAXBElement<UpdateMessageResponse>(_UpdateMessageResponse_QNAME, UpdateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "updateMessage")
    public JAXBElement<UpdateMessage> createUpdateMessage(UpdateMessage value) {
        return new JAXBElement<UpdateMessage>(_UpdateMessage_QNAME, UpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "findMessageById")
    public JAXBElement<FindMessageById> createFindMessageById(FindMessageById value) {
        return new JAXBElement<FindMessageById>(_FindMessageById_QNAME, FindMessageById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessageById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "deleteMessageById")
    public JAXBElement<DeleteMessageById> createDeleteMessageById(DeleteMessageById value) {
        return new JAXBElement<DeleteMessageById>(_DeleteMessageById_QNAME, DeleteMessageById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMesage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.datalex.com/", name = "addMesage")
    public JAXBElement<AddMesage> createAddMesage(AddMesage value) {
        return new JAXBElement<AddMesage>(_AddMesage_QNAME, AddMesage.class, null, value);
    }

}

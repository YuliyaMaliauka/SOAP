
package com.datalex.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerServise", targetNamespace = "http://service.datalex.com/", wsdlLocation = "http://localhost:9091/CustomerServise?wsdl")
public class CustomerServise_Service
    extends Service
{

    private final static URL CUSTOMERSERVISE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVISE_EXCEPTION;
    private final static QName CUSTOMERSERVISE_QNAME = new QName("http://service.datalex.com/", "CustomerServise");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9091/CustomerServise?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVISE_WSDL_LOCATION = url;
        CUSTOMERSERVISE_EXCEPTION = e;
    }

    public CustomerServise_Service() {
        super(__getWsdlLocation(), CUSTOMERSERVISE_QNAME);
    }

    public CustomerServise_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVISE_QNAME, features);
    }

    public CustomerServise_Service(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVISE_QNAME);
    }

    public CustomerServise_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVISE_QNAME, features);
    }

    public CustomerServise_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServise_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerServise
     */
    @WebEndpoint(name = "CustomerServisePort")
    public CustomerServise getCustomerServisePort() {
        return super.getPort(new QName("http://service.datalex.com/", "CustomerServisePort"), CustomerServise.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServise
     */
    @WebEndpoint(name = "CustomerServisePort")
    public CustomerServise getCustomerServisePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.datalex.com/", "CustomerServisePort"), CustomerServise.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVISE_EXCEPTION!= null) {
            throw CUSTOMERSERVISE_EXCEPTION;
        }
        return CUSTOMERSERVISE_WSDL_LOCATION;
    }

}

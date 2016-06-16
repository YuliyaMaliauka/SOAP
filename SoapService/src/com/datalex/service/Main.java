package com.datalex.service;


import javax.xml.ws.Endpoint;
public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9091/CustomerServise", new CustomerServise());
	}

}

package org.mayank.soapservice;

import javax.xml.ws.Endpoint;

public class MYMartPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/mymartcatalogservice", new ProductCatalog());

	}

}

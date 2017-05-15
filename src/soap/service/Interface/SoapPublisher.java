package soap.service.Interface;

import javax.xml.ws.Endpoint;

public class SoapPublisher {
public static void main(String args[]){
	Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());
}
}

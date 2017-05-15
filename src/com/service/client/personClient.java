package com.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soap.service.Bean.Person;
import soap.service.Interface.PersonService;;
public class personClient {
public static void main(String args[]) throws MalformedURLException{
	URL url= new URL("http://localhost:8888/ws/person?wsdl");
	QName qname=new QName("http://Interface.service.soap/","PersonServiceImplService");
	Service personService= Service.create(url, qname);
	PersonService ps=personService.getPort(PersonService.class);
Person p1=new Person();
p1.setAge(12);
p1.setId(10);
p1.setName("meghna");

Person p2=new Person();
p2.setAge(13);
p2.setId(11);
p2.setName("sopra");

System.out.println(ps.addPerson(p1));
System.out.println(ps.addPerson(p2));
System.out.println(ps.getPerson(10));
for(int i=0;i<ps.getAllPerson().length;i++)
	System.out.println(ps.getAllPerson()[i]);

System.out.println(ps.deletePerson(10));
for(int i=0;i<ps.getAllPerson().length;i++)
	System.out.println(ps.getAllPerson()[i]);

}
}

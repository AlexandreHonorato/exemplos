package br.com.ws.service;

import java.util.List;

import br.com.ws.service.client.Person;
import br.com.ws.service.client.PersonServiceImpl;
import br.com.ws.service.client.PersonServiceImplService;

public class PersonClient {
	
	public static void main(String[] args) {
		PersonServiceImplService service = new PersonServiceImplService();
		PersonServiceImpl port = service.getPersonServiceImplPort();
		
		List<Person> persons = port.list();
		for (Person p: persons)
			System.out.println(p.toString());
		
	}

}

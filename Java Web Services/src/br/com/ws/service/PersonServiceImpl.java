package br.com.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.ws.model.Person;
import br.com.ws.model.PersonDAO;

@WebService
public class PersonServiceImpl {

	private PersonDAO dao = new PersonDAO();
	  
	@WebMethod
	public Long create(Person person) {
		return dao.create(person);
	}
	@WebMethod
	public Person read(Long id) {
		return dao.read(id);
	}
	@WebMethod
	public void update(Person person) {
		dao.update(person);
	}
	@WebMethod
	public void delete(Person person) {
		dao.delete(person);
	}
	@WebMethod
	public List<Person> list() {
		return dao.list();
	}
	
}

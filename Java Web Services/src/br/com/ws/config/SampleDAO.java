package br.com.ws.config;

import br.com.ws.model.Person;
import br.com.ws.model.PersonDAO;
import br.com.ws.util.HibernateUtil;

public class SampleDAO {

	/**
	 * @author Wagner Fonseca
	 * @email wagner.fonseca@gmail.com
	 */
	public static void main(String[] args) {
		
		HibernateUtil.session = HibernateUtil.getConfiguration().buildSessionFactory().openSession();
		
		Person jose = new Person("Jose de Alencar", 1829, "Ceara");
		Person machado = new Person("Machado de Assis", 1839, "Rio de Janeiro");
		Person aluisio = new Person("Aluisio de Azevedo", 1857, "Sao Luis");
		Person guimaraes = new Person("Guimaraes Rosa", 1908, "Rio de Janeiro");
		
		PersonDAO dao = new PersonDAO();
		
		dao.create(jose);
		dao.create(aluisio);
		dao.create(machado);
		dao.create(guimaraes);
		
		System.out.println(jose.toString());
		System.out.println(machado.toString());
		System.out.println(aluisio.toString());
		System.out.println(guimaraes.toString());
		
		System.exit(0);
	}

}

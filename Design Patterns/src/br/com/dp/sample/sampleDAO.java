package br.com.dp.sample;

import br.com.dp.model.User;
import br.com.dp.model.UserDAO;
import br.com.dp.util.HibernateUtil;

public class sampleDAO {

	/**
	 * @author Wagner Fonseca
	 * @email wagner.fonseca@gmail.com
	 */
	public static void main(String[] args) {
		
		HibernateUtil.session = HibernateUtil.getConfiguration().buildSessionFactory().openSession();
		
		User user =  new User();
		user.setNome("GUEST");
		user.setSenha("v1s1374n7e");
		
		UserDAO dao = new UserDAO();
		
		Long id = dao.create(user);
		System.out.println("Usuario ID: " + id.intValue());
		
		System.exit(0);
	}

}

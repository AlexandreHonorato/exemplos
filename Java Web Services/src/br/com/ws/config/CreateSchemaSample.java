package br.com.ws.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import br.com.ws.model.Person;
import br.com.ws.util.HibernateUtil;

public class CreateSchemaSample {

	public static void main(String[] args) {
		
		Configuration cfg = HibernateUtil.getConfiguration()
				.addAnnotatedClass(Person.class)
			;
		
		SchemaUpdate schema = new SchemaUpdate(cfg);
		schema.execute(true, true);
	}

}

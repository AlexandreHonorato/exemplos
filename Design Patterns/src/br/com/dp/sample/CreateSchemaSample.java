package br.com.dp.sample;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import br.com.dp.model.User;
import br.com.dp.util.HibernateUtil;

public class CreateSchemaSample {

	public static void main(String[] args) {
		
		Configuration cfg = HibernateUtil.getConfiguration()
				.addAnnotatedClass(User.class)
			;
		
		SchemaUpdate schema = new SchemaUpdate(cfg);
		schema.execute(true, true);
	}

}

package sample;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import util.HibernateUtil;

public class CreateSchema {

	public static void main(String[] args) {
		Configuration cfg = HibernateUtil.getConfiguration();
		
		SchemaUpdate schema = new SchemaUpdate(cfg);
		schema.execute(true, true);

	}

}

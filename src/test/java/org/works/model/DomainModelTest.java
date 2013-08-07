package org.works.model;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DomainModelTest extends TestCase {
	@Test
	public void testModuleStartup() {

		System.out.println("Domain Model startup success!");
		Session session;
		Configuration config = null;
		Transaction tx = null;
		Resource conf = null;
		try {
			conf = new ClassPathResource("model/hibernate.cfg.xml");
			config = new Configuration().configure(conf.getFile());
			config.addPackage("org.works.model");
			System.out.println("Creating tables...");
			SessionFactory sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			SchemaExport schemaExport = new SchemaExport(config);
			schemaExport.create(true, true);
			List<Exception> exceptions = schemaExport.getExceptions();

			for (Exception e : exceptions) {
				System.out.println(e);
			}

			System.out.println("Table created.");
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}
}

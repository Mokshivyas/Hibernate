package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//Hibernate Query Language(object oriented query lang)
public class HQLMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession(); //represents database connection & light weight
		Transaction t = s.beginTransaction();
		
		//JPA (java persistent Api) Query
	//	Query q = s.createQuery("from Product");
		//Query q = s.createQuery("from Product p where p.price>45000 and p.price<90000");
		//Query q = s.createQuery("from Product p where p.price between 3000 and 10000");
	//	Query q = s.createQuery("from Product p where p.brand like 'H%'");
		/*
		 * Query q = s.createQuery("from Product p where p.name = 'Laptop'");
		 * List<Product> products = q.getResultList(); for(Product p:products) {
		 * System.out.println(p); }
		 */
		
		/*
		 * //Query q = s.createQuery("select p.name,p.price from Product p"); // Query q
		 * = s.createQuery("select p.productId,p.name,p.brand from Product p \t"); Query
		 * q = s.createQuery("select p.price,p.brand,p.name from Product p");
		 * List<Object[]> objects = q.getResultList(); for(Object[] ob: objects) {
		 * for(int i=0;i<ob.length;i++) { System.out.println(ob[i]); } }
		 */
	
		
		
		Query q= s.createQuery("select max(p.price) from Product p");
		Float maxPrice = (Float) q.getSingleResult();
		System.out.println(maxPrice);
		
		Query q1= s.createQuery("select min(p.price) from Product p");
		Float minPrice = (Float) q1.getSingleResult();
		System.out.println(minPrice);
		
		Query q2= s.createQuery("select sum(p.price) from Product p");
		Double sumPrice = (Double) q2.getSingleResult();
		System.out.println(sumPrice);
		
		Query q3= s.createQuery("select avg(p.price) from Product p");
		Double avgPrice = (Double) q3.getSingleResult();
		System.out.println(avgPrice);
		
		
		Query q4= s.createQuery("select count(p.price) from Product p");
		Long countPrice = (Long) q4.getSingleResult();
		System.out.println(countPrice);
		
		/*
		 * Criteria cr = s.createCriteria(Product.class); List<Product> products =
		 * cr.list(); for(Product p:products) { System.out.println(p); } t.commit();
		 * s.close();
		 */

	}

}

package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {

Configuration c = new Configuration().configure();
//singleton and heavy weight session factory
SessionFactory f = c.buildSessionFactory();
Session s = f.openSession(); //represents database connection & light weight
Transaction t = s.beginTransaction();

//insert new record
//Product p = new Product(1009,"Mobile","Apple",90000);
//s.save(p);

//get record acc to PK

		/*
		 * Product p = s.get(Product.class,1010); 
		 * if(p!=null) { 
		 * System.out.println(p);
		 * 
		 * } else { System.out.println("Object not found"); }
		 */
	

//Product p = s.load(Product.class,1005);
//System.out.println(p);

		/*
		 * //Update Product p = s.get(Product.class,1005); if(p!=null) { p.getPrice();
		 * p.setPrice(p.getPrice()/1000);
		 * 
		 * //p.setPrice(2002); s.update(p);
		 * 
		 * } else { System.out.println("Object not found"); }
		 */

//Delete Record

Product p = s.get(Product.class,1005); 
if(p!=null) 
	{ 
		s.delete(p);

 } else 
 	{ 
	 System.out.println("Object not found"); 
	 }

t.commit();  //in dml operations
s.close();

	}

}

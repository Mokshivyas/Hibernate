package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f =c.buildSessionFactory();
		Session s =f.openSession();
		Transaction t= s.beginTransaction();
		
		Name name = new Name();
		name.setFirstName("Ram");
		name.setMiddleName("Kumar");
		name.setLastName("Shah");
		
		Customer cu = new Customer();
		cu.setCustomerId(2);
		cu.setCustomerName(name);
		cu.setAge(50);
		cu.setGender("Male");
		cu.setAddress("Pune");
		cu.setBirthDate(LocalDate.of(1996, 12, 31));
		try {
			File photo = new File("./resources/download.jpg");
			FileInputStream fin = new FileInputStream(photo);
			
			Blob customerPhoto = BlobProxy.generateProxy(fin,photo.length());
			cu.setProfilePhoto(customerPhoto);

			s.save(cu);
			
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

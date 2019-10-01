package com.zensar.entities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f =c.buildSessionFactory();
		Session s =f.openSession();
		Transaction t= s.beginTransaction();
		
		Customer cu = s.get(Customer.class,2);
		System.out.println(cu.getCustomerId());
		System.out.println(cu.getAddress());
		System.out.println(cu.getAge());
		System.out.println(cu.getGender());
		System.out.println(cu.getBirthDate());
		Name customerName = cu.getCustomerName();
		System.out.println(customerName);
		Blob customerPhoto = cu.getProfilePhoto();
		try {
			InputStream in = customerPhoto.getBinaryStream();
			FileOutputStream fout = new FileOutputStream("./resources/newphoto.jpg");
			int data = 0;
			while((data = in.read()) != -1) {
				fout.write(data);
			}
			in.close();
			fout.close();
			
			
			
			
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

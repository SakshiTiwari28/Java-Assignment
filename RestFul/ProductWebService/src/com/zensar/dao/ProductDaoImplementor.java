package com.zensar.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;
/*
 *  Author:Sakshi Tiwari
 *  Date: 26th Jul 2019 10.00AM
 *  Modified Date: 26th Jul 2019 10.00AM
 *  Version: 1.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: Data Access Object Interface implementor.
 *  It implements all the method of ProductDao interface
 *  It uses Hibernate API to access Product Data from Database.
 *  
 */



public class ProductDaoImplementor implements ProductDao {

	private Session session;
	
	public ProductDaoImplementor(){
		Configuration cfg =new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Database Connection Established");
		
	}
	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        System.out.println("Product Inserted");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        System.out.println("Product Updated");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		System.out.println("Product deleted");

	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		
		return session.get(Product.class, productId);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Query query =session.createQuery("from Product");
		return query.getResultList();
	}

}

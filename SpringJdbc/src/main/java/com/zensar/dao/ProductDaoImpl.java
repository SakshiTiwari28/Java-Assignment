package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;




/*
 *  Author:Sakshi Tiwari
 *  Date: 25th Jul 2019 5.55AM
 *  Modified Date: 30th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: Represent DAO class 
 *  which implemnets dao interface. It contains CRUP operation method implemention
 */

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired //any (dependency) object will be injected automatically without writing setter method
	private JdbcTemplate jt;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
      String sql ="insert into product value(?,?,?,?)";
      jt.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
      System.out.println("Product is Inserted");
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		String sql ="update product set name=?, brand=?, price=?" + " where id =?";
		jt.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Product is Updated");

	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sql ="delete product from product where id=?";
		jt.update(sql,product.getProductId());
		System.out.println("Product is Deleted");
   
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql ="select id, name,brand,price from product" + " where id=?";
		Product dbProduct =jt.query(sql,new Object[]{productId}, new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()){
					Product product =new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					
					return product;
				}
				else
				return null;
			}
		});
		
		return dbProduct;
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql ="select * from product";
		List<Product> productList = jt.query(sql, new ResultSetExtractor<List<Product>>(){

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> pList =new ArrayList<Product>();
				while(rs.next()){
					Product p =new Product();
					p.setProductId(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setBrand(rs.getString(3));
					p.setPrice(rs.getFloat(4));
					pList.add(p);
				}
				
				return pList;
			}
		});
		
		
		return productList;
	}

}

package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.entities.Product;

/*
 *  Author:Sakshi Tiwari
 *  Date: 25th Jul 2019 5.55AM
 *  Modified Date: 30th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: 
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	public void create(Product product) {
		// TODO Auto-generated method stub

		dao.insert(product);
	}

	public void edit(Product product) {
		// TODO Auto-generated method stub
    Product dbProduct = findProductById(product.getProductId());
    if(dbProduct!=null){
    	dbProduct.setName(product.getName());
    	dbProduct.setBrand(product.getBrand());
    	dbProduct.setPrice(product.getPrice());
    	dao.update(dbProduct);
    }
    else
    	System.out.println("Sorry!!Product does not exist");
}

	public void remove(Product product) {
		// TODO Auto-generated method stub
	   Product dbProduct =findProductById(product.getProductId());
	   if(dbProduct!=null){
		   dao.delete(dbProduct);
	   }
	   else
		   System.out.println("Nothing to Delete");
	   
	   

	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}




}

package com.zensar.service.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 *  Author:Sakshi Tiwari
 *  Date: 26th Jul 2019 5.55AM
 *  Modified Date: 26th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: Business Object Interface 
 *  It focuses on business logic of Product
 */

public interface ProductService {
	
	void create (Product product);
	void edit (Product product);
	void remove (Product product);
	
	Product findProductById(int productId);
	
	List<Product> findAllProducts();
	int getProductCount();
	List<Product> findProductsByBrand(String brand);
	List<Product> findProductsByPriceRange(float minPrice, float maxPrice);

}

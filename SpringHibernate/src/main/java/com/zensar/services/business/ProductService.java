package com.zensar.services.business;

import java.util.List;


import com.zensar.entities.Product;

/*
 *  Author:Sakshi Tiwari
 *  Date: 25th Jul 2019 5.55AM
 *  Modified Date: 30th Jul 2019 4.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: It represents Product Services which can be accessed by Presentation Layer
 *  It encapsulates business logic of product entity
 */

public interface ProductService {
	

	void create(Product product);
	void edit(Product product);
	void remove (Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();

}

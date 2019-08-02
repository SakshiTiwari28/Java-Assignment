package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
    	
     ApplicationContext ctx =new ClassPathXmlApplicationContext("dbConfig.xml");
     Product product =new Product(1011, "AirConditioner" ,"LG",50000);
     ProductService service = ctx.getBean("productServiceImpl",ProductService.class);
     Product product1 = new Product(1005,"Refrigerator","Samsung",65770);
    service.edit(product1);
    service.create(product);
    product =service.findProductById(1002);
     System.out.println(product);
     
     
    
     
     Product product2 = new Product();
     product2.setProductId(1010);
     service.remove(product2);
     
    List<Product> productList = service.findAllProducts();
     for(Product p: productList)
    	 System.out.println(p);
  
     
    }
}

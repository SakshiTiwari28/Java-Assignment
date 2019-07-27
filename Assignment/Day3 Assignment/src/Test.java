 class Product {
 private int productId;
 private String productName;
 private float costOfProduct;
 private static int count;
 
 public Product(){
	 count++;
 }
 public Product(int pi , String pn, float c ){
	 productId=pi;
	 productName=pn;
	 costOfProduct=c;
	 count++;
 }
 static {
	 count=0;
 }
 public  void display(){
System.out.println(productId + " " + productName + " " + costOfProduct);
 }
 public  static void showProduct(){
	 System.out.println("Number of objects created " +count);
 }
}

public class Test{
public static void main(String args[]){
	Product p1=new Product();
	Product p2=new Product(1, "Oil",736);
	Product p3=new Product(2, "Chocolate",60);
	Product p4=new Product(3, "Cake",700);
	p1.display();
	p2.display();
	p3.display();
	p4.display();
	Product.showProduct();
	
}
}

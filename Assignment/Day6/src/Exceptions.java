import java.util.*;
class A{
	
	public void fun(){
		
	}
	
}
public class Exceptions {
//	A a= null; //new A();
//	a.fun();
		public static void foo() throws InterruptedException{
			foo1();
		}
		public static void foo1() throws InterruptedException{
			Thread.sleep(10);
		}
		public static void main(String args[]){

	try{
	foo();
	System.out.println("Test");}
	catch(InterruptedException e){
		System.out.println("Exception");
		
	}
}
}

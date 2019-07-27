

class AccountHolder{
 private int accountNumber;
 private String name;
 private float balance;
 private static int count;
 
 public AccountHolder(){
	 accountNumber=100;
	 accountNumber=++count;
 }
 public AccountHolder(int a , String n , float b){
	 accountNumber=a;
	 name=n;
	 balance=b;
	 accountNumber=++count;
 }
 static {
	 count=100;
 }
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public void display(){
	System.out.println("Account Holder Details " +accountNumber+ " " + name +" " + balance);
}
}

public class Test2{
public static void main(String args[]){

	AccountHolder p1=new AccountHolder();
	AccountHolder p2=new AccountHolder();
	AccountHolder p3=new AccountHolder();
	p1.setBalance(5000);
	p2.setBalance(6000);
	p3.setBalance(7000);
	p1.setName("sakshi");
	p2.setName("Himanshi");
	p3.setName("Mishel");
	p1.display();
	p2.display();
	p3.display();
	
	
}
}



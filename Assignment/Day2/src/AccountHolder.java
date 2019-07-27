import java.util.Scanner;


class AccountHolder {
 
	private int accno;
	private String accname;
	private float balance;


	public AccountHolder(){
	accno=0;
	accname=null;
	balance=0;
	}       
	public AccountHolder(int ano){
	 accno=ano;
	 accname=null;
		balance=0;
	}
	public AccountHolder(int ano,String aname){
	 accno=ano;
	 accname=aname;
		balance=0;
	 
	}
	public AccountHolder(int ano,String aname, float bln){
	 accno=ano;
	 accname=aname;
		balance=bln;
	 
	}
	public int getAccountNumber(){
		return accno;
	}
	public void setAccountNumber(int ano){
		 accno=ano;
	}
	public String getAccountName(){
		return accname;
	}
	public void setAccountName(String aname){
		 accname=aname;
	}
	public float getAccountBalance(){
		return balance;
	}
	public void setAccountBalance(float bln){
		 balance=bln;
	}
}



class Account{
	private int balance;
	public Account(){
		
	}
	public Account(int b){
		balance=b;
	}
	public synchronized void deposit(int amount){
		System.out.println("Balance before Deposit "+balance);
		try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		balance=balance+amount;
		System.out.println("Balance after Deposit "+balance);
	}
	public synchronized void withdraw(int amount)
	{   System.out.println("Balance before Deposit "+ balance);
try {
	Thread.sleep(10);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
}
		balance= balance-amount;
		System.out.println("Balance after Deposit " +balance);
	}
}
class AccountUser extends Thread{
	private String name,tot;
	private Account account;
	private int amount;
	AccountUser(Account acc, String name, String tot,int amount){
		account=acc;
		this.name=name;
		this.tot=tot;
		this.amount=amount;
	}
	public void run(){
		if(tot.equals("Deposit")){
			account.deposit(amount);
		}
		else if(tot.equals("Withdraw")){
			account.withdraw(amount);
		}
	}
}
public class Synchronised_thread {
	public static void main(String args[]){
		Account ac=new Account(5000);
		AccountUser user1=new AccountUser(ac,"Sakshi","Withdraw",500);
		AccountUser user2=new AccountUser(ac,"Himanshi","Deposit",800);
		user1.start();
		user2.start();
	}

}

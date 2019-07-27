import java.util.Scanner;


public class five{

	public static void main(String[] args) {
		AccountHolder ah[]=new AccountHolder[10];
		char choice='y';
		int i=0;
		int input;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the function to be performed");
		/* System.out.println("1. Add Record 2. Display all Records 3. Deposit Amount 4. Withdraw Amount"); */
		/* input=sc.nextInt(); */
		
		char ch='y';
		
		while(ch=='y') {
			System.out.println("1. Add Record 2. Display all Records 3. Deposit Amount 4. Withdraw Amount");
			input=sc.nextInt();
			switch(input){
				case 1 :{
		
						System.out.println("Enter record for account holder");
						i=0;
								while(choice=='y'){
										int ano;
										
										String anm;
										float bl;
										ah[i]=new AccountHolder();
										System.out.println("Enter the account number");
										ano=sc.nextInt();
										ah[i].setAccountNumber(ano);
										System.out.println("Enter the account name");
										anm=sc.next();
										ah[i].setAccountName(anm);
										System.out.println("Enter the account balance");
										bl=sc.nextFloat();
										ah[i].setAccountBalance(bl);
										System.out.println("Do you want to enter more records? (y/n)");
										choice=sc.next().charAt(0);
										count++;
										i++; }
								break;
						}
				case 2 : {
			
							for(i=0;i<count;i++){
								System.out.println("Account Number : "+ah[i].getAccountNumber());
								System.out.println("Account Holder Name : "+ah[i].getAccountName());
								System.out.println("Account Balance : "+ah[i].getAccountBalance());
								System.out.println();
							}
							break; 
						}
			
				case 3 : {
			
							System.out.println("Enter the account number");
							int acc;
							int c=0;
							
							acc=sc.nextInt();
							for(i=0;i<count;i++){
								if(acc==ah[i].getAccountNumber())
									c=i;
							}
								System.out.println("Account found!");
								System.out.println("Enter the balance to be updated");
								float oldbln,newbln,sumbln=0;
								newbln=sc.nextFloat();
								oldbln=ah[c].getAccountBalance();
								sumbln=oldbln+newbln;
								ah[c].setAccountBalance(sumbln);
							
							 
							}
						break; 
						
			
				case 4 : {
							System.out.println("Enter the account number");
							int acc1;
							int c1=0;
							acc1=sc.nextInt();
							for(i=0;i<count;i++){
								if(acc1==ah[i].getAccountNumber())
									c1=i;
							}
							
								System.out.println("Account found!");
								System.out.println("Enter the balance to be withdrawn");
								float oldbln,newbln,diffbln=0;
								newbln=sc.nextFloat();
								oldbln=ah[c1].getAccountBalance();
								diffbln=oldbln-newbln;
								ah[c1].setAccountBalance(diffbln);
							
							break; 
						}
			}
			System.out.println("Operations ");
			ch=sc.next().charAt(0);
			
		}
		
		}
		
	}    
		
		
		


			







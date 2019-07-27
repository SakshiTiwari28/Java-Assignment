import java.util.Scanner;

class Calculation extends Thread{
	Thread t1,t2;
	private int num;
	Calculation(){
		num=0;
		t1= new Thread();
		t2= new Thread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    t2.start();
	}
	Calculation(int num){
		this.num=num;
		t1= new Thread(this,"A");
		t2= new Thread(this,"B");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
		public void run()  
	    {    

			// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++){
			if(Thread.currentThread()==t1){
				System.out.println(t1.getName() + " " + (num+i));
			}
	
		}

			System.out.println();
			for(int j=1;j<=10;j++){
		if(Thread.currentThread()==t2)
				System.out.println(t2.getName()+ " " +(num*j));
		}
     }
}

public class Test1 {
public static void main(String args[]){
	int num;
	Calculation c;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number");
	num=sc.nextInt();
	new Calculation(num);
	
	
}
}


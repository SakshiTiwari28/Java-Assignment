
import java.util.Scanner;

class MyThread1 extends Thread implements Runnable{
	private Thread t1,t2;
	int num1,num2,i,j;
	int fact=1;
	int sum=0,rem;
	
	
	public MyThread1(int n1,int n2) {
		num1=n1;
		num2=n2;
		t1=new Thread(this,"Factorial Between");
		t2=new Thread(this,"Sum of digits");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
	public  void run() {
		for(i=num1;i<=num2;i++) { 
			if(Thread.currentThread()==t1) {
				for(j=1;j<=i;j++) {
					fact=fact*j;
				}
			System.out.println(fact+" ");
			fact=1;
			}
			
		}
		if(Thread.currentThread()==t2) {
		for(i=num1;i<=num2;i++) {
			 {
				sum=sum+i;
				}
			}
		System.out.println(sum);
		}
	}
		
}
		





public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the range ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		new MyThread1(n1,n2);

	}

}

import java.util.Scanner;

class Mythread implements Runnable{

	private Thread t1, t2;
	String name;
	Mythread(){
		
		t1= new Thread(this, "Hello Thread");
		t2= new Thread(this, "Hello Thread2");
		t1.start();
		t2.start();
	}
	Mythread(String name){
		this.name=name;
        t1= new Thread(this, "Hello Thread");
		t2= new Thread(this, "Hello Thread2");
		t1.start();
		t2.start();
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	int i;
	for(i=0;i<10;i++){
		if(Thread.currentThread()==t1){
			System.out.println("Hello..."+name);
		}
		else
			System.out.println("Hi..."+name);
	}
		
	}
	
}
public class Runnable_interface {
public static void main(String args[]){
	String name;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter name ");
	name=sc.next();
	new Mythread(name);
}
}

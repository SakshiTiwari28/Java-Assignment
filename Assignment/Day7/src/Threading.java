//class mythread1 extends Thread{
//	public void run(){
//		int i;
//		for(i=0;i<10;i++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				/*e.printStackTrace();*/
//			}
//			System.out.println("Hi....");
//		}
//
//	}
//	
//}
//class mythread2 extends Thread{
//	public void run(){
//		int i;
//		for(i=0;i<10;i++){
//			System.out.println("Hello....");
//		}
//}
//}	
//	
//	public class Threading {
//public static void main(String args[]){
//	mythread1 t1 =new mythread1();
//	mythread2 t2 =new mythread2();
//	t1.start();
//	t1.setPriority(Thread.MAX_PRIORITY);
//	try {
//		t1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//	}
//	t2.start();
//	System.out.println(t1.getPriority());
//	System.out.println(t2.getPriority());
////	t1.run();
////	t2.run();
//	t1.setName("Thread 1");
//	System.out.println(t1.getName());
//}
//	}
//

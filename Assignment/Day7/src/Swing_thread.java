import java.awt.*;
class MovingThread extends Frame implements Runnable{
	private Thread t1,t2;
	private int x1,x2;
	public MovingThread(){

        t1= new Thread("ZENSAR");
		t2= new Thread("JAVA");
		x1=100;
		x2=200;
		t1.start();
		t2.start();
	}	
	
	public void run(){
		
		while(true){
			
			if(Thread.currentThread()==t1){
				x1++;
				if(x1==this.getWidth()){
					x1=0;
				}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
			else if(Thread.currentThread()==t2){
				x2--;
				if(x2==0){
					x2=this.getWidth();
				}
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
				repaint();

		}	
			
}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);	
		g.setFont(new Font("verdana", 20,20));
		g.drawString("Zensar", x1, 200);	
	    g.setColor(Color.GREEN);
	    g.drawString("JAVA", x2, 100);
	    
	}
	
}
public class Swing_thread {
	public static void main(String args[]){
		MovingThread fm= new MovingThread();
		fm.setSize(400,400);
		fm.setVisible(true);
		System.out.println("Text");
		
	}

}

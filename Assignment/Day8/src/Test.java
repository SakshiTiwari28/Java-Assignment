import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class MovingCircle extends Frame implements Runnable {
	private int xb, xg;
	Thread t1, t2, t3;
	public MovingCircle(int width){
		xb=100;
		xg=100;
		t1= new Thread (this ,"Blue");
		t2= new Thread(this,"Green");
		t1.start();
		t2.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(xb, 100, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(xg, 250, 50, 50);
	}
	@Override
	public void run() {
		while(true){
			if(Thread.currentThread()==t1){
				synchronized(this){
					xb++;
					if(xb==this.getWidth()-50)
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 	}
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread()==t2){
				synchronized(this){
					xg--;
					if(xg==10){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						notifyAll();
						xg=xb;
						xb=100;
					}
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			repaint();
		}
		
	}
  
}
public class Test{
	public static void main(String args[]){
		int width =400;
		MovingCircle ms= new MovingCircle(width);
		ms.setSize(width,400);
		ms.setVisible(true);
		System.out.println("Circle");
	}
}

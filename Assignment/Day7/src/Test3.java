

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


class MovingCircle extends Frame implements Runnable{
	private Thread t1;
	private int x,flag=0;
	
	public MovingCircle() {
		t1=new Thread(this,"circle");
		x=100;
		t1.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, 100, 50, 100);
	}
	public void run() {
		while(true) {
				if(flag==0) {
						x++;
						if(x==(this.getWidth()-200)) {
							flag=1;
							
						}
						try {
							Thread.sleep(10);
						}catch(Exception e) {}
						
				}
				
				else if(flag==1) {
					x--;
					if(x==0) {
						flag=0;
						
					}
					try {
						Thread.sleep(10);
					}catch(Exception e) {}
				}
				repaint();
				}
	}
}
public class Test3 {

	public static void main(String[] args) {
		MovingCircle mc=new MovingCircle();
		mc.setSize(400,400);
		mc.setVisible(true);
		System.out.println("test");

	}

}


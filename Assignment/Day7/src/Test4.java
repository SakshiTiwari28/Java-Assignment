import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


class GrowingCircle extends Frame implements Runnable{
	private Thread t1;
	private int x,flag=0;
	
	public GrowingCircle() {
		t1=new Thread(this,"circle");
		x=100;
		t1.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(100, 100, x, x);
	}
	public void run() {
		while(true) {
				if(flag==0) {
						x++;
						if(x==(this.getWidth()-100)) {
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
public class Test4 {

	public static void main(String[] args) {
		GrowingCircle gc=new GrowingCircle();
		gc.setSize(400,400);
		gc.setVisible(true);
		System.out.println("test");

	}

}




import java.awt.*;

class MovingString extends Frame implements Runnable{
	private int xr,xg,xb;
	Thread t1, t2, t3;
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(xr,100,50,50);
		g.setColor(Color.GREEN);
		g.fillOval(xg, 250, 50,50);
		g.setColor(Color.blue);
		g.fillOval(xb, 400               , 50,50);
		
	}
	public MovingString(){
		xr=xg=xb=100;
		t1=new Thread(this,"red");
		t2=new Thread(this,"green");
		t3=new Thread(this,"blue");
		t1.start();
		t2.start();
		t3.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub{
		while(true){
		if(Thread.currentThread()==t1)
		{
			xr++;
			synchronized(this)
		{
			if(xr==this.getWidth()-50)
			{
				try 
				{
					wait();
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(Thread.currentThread()==t2){
			xg++;
			if(xg==this.getWidth()-50){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(Thread.currentThread()==t3){
			xb++;
			if(xb==this.getWidth()-50){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			}
		
	}
	private void synchronised(MovingString movingString) {
		// TODO Auto-generated method stub
		
	}
}
public class thread_method {
public static void main(String args[]){
	MovingString ms=new MovingString();
	ms.setSize(600,600);
	ms.setVisible(true);
	System.out.println("ABC");
	
}
}

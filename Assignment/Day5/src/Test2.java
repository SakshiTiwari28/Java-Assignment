

class LinearQueue<G>{
	private G []arr;
	private int size, front, rear;
	public LinearQueue(G[] arr, int size, int front, int rear) {
		super();
		this.arr = arr;
		this.size = size;
		this.front = front;
		this.rear = rear;
	}
	public LinearQueue() {
		super();
		rear=-1;
		front=0;
		size=5;
		arr=(G[]) new Object[size];
		// TODO Auto-generated constructor stub
	}
	public void insert(G data){
		if(!isFull())
			arr[++rear]=data;
		else
			System.out.println("Queue overflow");
		
		}
		
	private boolean isFull() {
		// TODO Auto-generated method stub
	
		
			return rear==size-1;
			

	}

	
	public G remove(){
		if(!isEmpty()){
			return arr[front++];
		}
			else
				System.out.println("Linear Queue is Empty");
		return null;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return rear==front;
	}
	
}

public class Test2 {
	public static void main(String args[]){
		
		LinearQueue <Integer> l1=new LinearQueue<>();
		l1.insert(100);
		l1.insert(101);
		l1.insert(102);
		l1.insert(103);
		System.out.println(l1.remove());
		System.out.println(l1.remove());
      LinearQueue<String> l2=new LinearQueue<>();
        l2.insert("One");
		l2.insert("Two");
		l2.insert("Three");
		l2.insert("Four");
		System.out.println(l2.remove());
		System.out.println(l2.remove());
      
		
	}

}

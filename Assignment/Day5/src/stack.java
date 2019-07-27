
class ssTack<G>{
	private G []arr;
	private int top,size;
    ssTack(){
	size=5;
	arr=(G[]) new Object[size];
	top=-1;
}
    public void push(G data){
    	if(!isFull())
    	arr[++top]=data;
    	else
    		System.out.println("Stack is Full");
    }
    public G pop(){
    	if(!isEmpty())
    	return arr[top--];
    	else
    		System.out.println("Stack is Empty");
    	return null;
    }
    public Boolean isFull(){
    	return top==size-1;
    }
    public Boolean isEmpty(){
    	return top==-1;
    }
   
}
public class stack {
   public static void main(String args[]){
	   ssTack<Integer> s =new ssTack<>();
	   s.push(1);
	   s.push(2);
	   s.push(3);
	   s.push(4);
	   s.push(6);
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	   
	   ssTack<String> s2 =new ssTack<> ();
	   s2.push("First");
	   s2.push("SEcond");
	   s2.push("Third");
	   System.out.println(s2.pop());
	   System.out.println(s2.pop());
	   

}
}

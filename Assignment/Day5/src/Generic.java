
public class Generic<G>{
	public void swap(G a,G b){
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"\t"+b);
	}
	public static void main(String args[]){
	   Generic<Integer> t1=new Generic<>();
	   t1.swap(10,20);

	   Generic<String> t2=new Generic<>();
	   t2.swap("One","Two");
	   
	   
		
	
	   
	   
		
	}

}

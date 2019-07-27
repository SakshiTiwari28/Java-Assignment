import java.util.*;


public class Collection {
public  static void main(String args[]){
	Vector<Integer> v= new Vector<>();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	System.out.println(v); //toString
	System.out.println();
	for(Integer x:v){
		System.out.println(x+ " "); //using for each
	}
	System.out.println();
	Iterator<Integer> it= v.iterator();//using iterator
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}

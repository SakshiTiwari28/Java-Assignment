import java.util.Scanner;

public class one {
	public static void main(String args[]){
		int []a ;
		int max ,min,i;
		a=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter elemnts of array");
		for( i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=0;i<a.length;i++){
			if(a[i]>max){
			max=a[i];	
			}
		}
		System.out.println("Maximum element is " +max);
	min=a[0];
	for( i=0;i<a.length;i++){
		if(a[i]<min){
		min=a[i];	
		}
	}
	System.out.println("Minimum element is " +min);
}

   
}

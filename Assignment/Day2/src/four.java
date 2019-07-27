import java.util.Scanner;

public class four {
	public static void main(String args[]){
		int a[],i,j,b[];
		a=new int[5];
		b=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements of array");
		for(i=0;i<a.length;i++){
			a[i]= sc.nextInt();
		}
		System.out.println("Elements of a are ");
		for(i=0;i<a.length;i++){
			System.out.println(a[i] + " ");
		}
		System.out.println("Reversed array");
	for(i=a.length-1;i>=0;i--){
		System.out.println(a[i]);
	
	}
	
	
	}
}

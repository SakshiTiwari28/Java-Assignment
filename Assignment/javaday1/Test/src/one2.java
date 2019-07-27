import java.util.Scanner;

public class one2 {
	public static void main(String args[]){
		int a[],b[];
		int i;
		a=new int[5];
		b=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Elements of a");
		for(i=0;i<a.length;i++){
			a[i]= sc.nextInt();
		}
		System.out.println(" Elements of a:");
		for(i=0;i<a.length;i++){
			System.out.println(a[i]+ " ");
		}
		for(i=0;i<b.length;i++){
			b[i]=5*a[i];
		}
		System.out.println("ELments of b:");
		for(i=0;i<b.length;i++){
			System.out.println(b[i]+ " ");
		}
		
		
		
	}

}

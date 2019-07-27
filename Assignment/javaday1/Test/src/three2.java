import java.util.Scanner;

public class three2{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter a and b");
	a= sc.nextInt();
	b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Swapped values without third variable are a =" +a+ " b = " +b);
	}
}

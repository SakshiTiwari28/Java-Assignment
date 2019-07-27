import java.util.Scanner;

public class three1{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter a and b");
	a= sc.nextInt();
	b=sc.nextInt();
        c=a;
        a=b;
	b=c;
	System.out.println("Swapped values without third variable are a =" +a+ " b = " +b);
	}
}


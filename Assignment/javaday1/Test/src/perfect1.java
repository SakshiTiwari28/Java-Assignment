
	import java.util.Scanner;
	public class perfect1
	{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Start Number");
	    int a=sc.nextInt();
	    System.out.println("Enter End Number");
	    int b=sc.nextInt();
	    System.out.println("Perfect Numbers between " + a + " and " + b + " are :");
	    for (int i=a; i<=b; i++)
	    {
	    int sum=0;
	    for (int j=1 ; j<i;j++)
	        {
	            if (i % j==0) 
	            sum=sum+j;
	        }
	     if (i==sum) System.out.print(i + "\t");
	    }
	}
 
}

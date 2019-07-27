import java.util.Scanner;

public class nine{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num,i;
	boolean flag=false;
	System.out.println("Enter Number");
	num = sc.nextInt();

	for(i=2;i<=num/2;++i)
	{
   
		if(num%i==0){
			flag=true;
			break;
	}
	}
	
	if(!flag){
			System.out.println("Number is Prime");
		}
	else{
		System.out.println("Number is  not prime");
	}
	

}
}

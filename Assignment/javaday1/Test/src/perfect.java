

import java.util.Scanner;

public class perfect {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sum=0,num,i;
	System.out.println("Enter Number");
	num=sc.nextInt();
	for(i=1;i<=num/2;i++)
	{
		if(num%i==0){
			sum=sum+i;
			}
	}
	if(sum==num){
	System.out.println("Number is Perfect");	
	}
	else{
		System.out.println("Not perfect");
	}
  }
}
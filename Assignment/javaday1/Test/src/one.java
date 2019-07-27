
import java.util.Scanner;

public class one {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sub1,sub2,sub3,sub4,sub5;
	float total ,average;
	System.out.println("Enter Marks");
	sub1 =sc.nextInt();
	sub2= sc.nextInt();
	sub3= sc.nextInt();
	sub4 =sc.nextInt();
	sub5= sc.nextInt();
	total=sub1+sub2+sub3+sub4+sub5;
	average=total/5;
	System.out.println("Total marks = " + total);

		System.out.println("Average marks = " + average);
	}
  }

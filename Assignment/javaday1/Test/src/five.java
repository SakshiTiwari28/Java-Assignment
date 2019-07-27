import java.util.Scanner;

public class five{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	double basicSalary, netSalary,hra,da,pf, grossSalary;
	System.out.println("Enter Basic Salary");
	basicSalary= sc.nextInt();
	hra=(0.15*basicSalary);
	System.out.println(" HRA is " + hra);
	da=(0.30*basicSalary);
	System.out.println("DA is " +da);
	grossSalary= da+hra;
    System.out.println(" Gross Salary = " +grossSalary);
    pf=(0.125*grossSalary);
    System.out.println("PF = " + pf);
    netSalary= grossSalary-pf;
    System.out.println(" Net Salary = " +netSalary);
	}
}


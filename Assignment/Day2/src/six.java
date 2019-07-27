import java.util.*;

public class six {
	
	static Student student[] = new Student[50];
	static int counter=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);

	}
	
	public static void menu(Scanner sc) {
		
		int rollNo;
		String name;
		double percentage;
		
		System.out.println("Add Record - 1\nUpdate-2\nDisplay-3\n60%-4\nExit-5\n::");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("Enter your roll no.: ");
			rollNo = sc.nextInt();
			System.out.println("Enter your Name: ");
			name = sc.next();
			System.out.println("Enter your Percetage: ");
			percentage = sc.nextDouble();
			student[counter] = new Student(rollNo, name, percentage);
			counter++;
			System.out.println("\n");
			menu(sc);
			break;
		case 2:
			
			System.out.println("Enter roll no.: ");
			rollNo=sc.nextInt();
			System.out.println("Enter your Name: ");
			name = sc.next();
			System.out.println("Enter your Percetage: ");
			percentage = sc.nextDouble();
			
			
			for(int j=0; student[j]!=null; j++) {
				if(student[j].getRollNo()==rollNo) {
					student[j].update(name, percentage);
					System.out.println("\nUpdated record: "+student[j]);
				}
			}
			System.out.println("\n");
			menu(sc);
			break;
		case 3:
			for(int j=0; student[j]!=null; j++) {
				System.out.println(student[j]+"\n");
			}
			System.out.println("\n");
			menu(sc);
			break;
		case 4:
			for(int j=0; student[j]!=null; j++) {
				if(student[j].getPercentage()>60)
					System.out.println(student[j]+"\n");
			}
			System.out.println("\n");
			menu(sc);
			break;
		case 5:
			System.out.println("Exit");
			System.exit(0);
		}
	}
}

class Student{
	private int rollNo;
	private String name;
	private double percentage;
	
	public Student(int rollNo, String name, double percentage) {
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void update(String name, double percentage) {
		this.name=name;
		this.percentage=percentage;
	}
	
	public String toString() {
		return "Roll No: "+rollNo+"\nName: "+name+"\nPercentage: "+percentage;
	}
	
}





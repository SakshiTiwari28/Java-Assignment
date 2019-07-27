import java.util.Scanner;

//oops program structure(stick to 4 major pillar)
//abstraction(selection  of key attribute of an entity and ignoring rest)
//encapsulation(it refers to data hiding)
//inheritance(it is "is a " kid of relationship)
//polymorphism(different forms of same thing)
//constructor(method of class with same name and no return type)(used to initialise instance variable of an object)
//two constructors (default constructor(no parameter) ) and parameterised constructor

class Employee{
	private int empid;//declaration no memory allocated)
	private String name;
	private float salary;

	public Employee(int id, String name, float salary){
		this.empid=id;
		this.name=name;
		this.salary=salary;
		System.out.println("constructor");
	}
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details");
		empid= sc.nextInt();
		name=sc.next();
		salary=sc.nextFloat();		
		}
	public void display(){
		System.out.println("Employee details " + empid +" " + name +" " + salary );
	}
	public String toString(){
		return empid + " " +name+ " "+ salary;
	}
	public String getname(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}
public class Test {
	public static void main(String arg[])
	{
		Employee e1,e2,e3;
		e1 =new Employee(1,"SAKSHI",50000);
		e2=new Employee(2,"JAck",58784);
		System.out.println(e1);
		e2.setName("Ram");
		String n= e2.getname();
		System.out.println(n);
		e1.display();
		System.out.println(e2);
		
	}

}

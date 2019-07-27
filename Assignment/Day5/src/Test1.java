class  Student {
 private int rollno;
 private String name;
public Student(int rollno, String name) {
	
	this.rollno = rollno;
	this.name = name;
}
public Student(){
}
public String toString(){
	return "Student Name :" +name +"Roll no " +rollno;
}

public void display(){

	System.out.println(rollno);
	System.out.println(name);
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + rollno;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (rollno != other.rollno)
		return false;
	return true;
}



}

public class Test1 {
	public static void main(String args[]){
		Student s1= new Student(1,"Sakshi");
		Student s2=new Student(1,"Sakshi");
		Student s3=new Student(2,"Himanshi");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(s1.equals(s2)){
			System.out.println("Same");
			
		}
		else 
			System.out.println("Not Same");
	
	if(s1.equals(s3)){
		System.out.println("Same");
	}
	else
		System.out.println("Not Same");

}
}
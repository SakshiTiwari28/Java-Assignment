package com.zensar.pack1;

public class Student2 extends Address {
 private int rollno;
 private String name;
public Student2(int rollno, String name, String s , String a, String c, String st) {
	super(s,a,c,st);
	this.rollno = rollno;
	this.name = name;
}
public Student2(){
	super();
}
public String toString(){
	return "Student Name :" +name +"Roll no " +rollno;
}

public void display(){
	super.display();
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
	Student2 other = (Student2) obj;
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

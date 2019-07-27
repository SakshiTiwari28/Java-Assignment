import java.util.*;
//set is a collection of unique element
class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(per);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
			return false;
		return true;
	}

	public int compareTo(Student e) 
	{
			if(getPer()>e.getPer())
			{
				return 1;
			}
			else if(getPer()<e.getPer())
			{
				return -1;
			}
			else 
				return 0;
			
		}
	}

	//class StudentCompare implements Comparator<Student>{

	

	


public class Set_Collection {
	

public static void main (String args[]){
	Set<Student> s= new TreeSet<>();
//	s.add(new Student(1, "abc",78));
//	s.add(new Student (2, "def" ,86));
//	s.add(new Student (3,"ghi" ,35));
//	s.add(new Student(4,"add",78));
//	for(Student x:s){
//		System.out.println(x);
//	<Integer,String>> s= m.entrySet();
//	for(Map.Entry<Integer, String> i:s){
//		System.out.println(i.getKey()+ " " + i.getValue());
//		
//	}
//	System.out.println();Map<Integer,String> m=new HashMap<>();
//	m.put(11, "Sakshi");
//	m.put(25, "Himanshi");
//	m.put(3, "Mishel");
//	System.out.println(m);
//	Set<Map.Entry
//	Set<Integer> ss = m.keySet();
//	for(Integer k:ss){
//		System.out.println(k+ " "+m.get(k));
	List<Student> list = new ArrayList<>();
	list.add(new Student(1, "ABC", 49));
	list.add(new Student(2, "DEF",78));
	list.add(new Student(3,"GHI",56));
	//Collections.sort(list,new StudentCompare());
	Collections.sort(list);
	for(Student x:list){
		System.out.println(x);
	}
	
	
		
	}
	
}
	
	



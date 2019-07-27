import java.util.HashSet;
import java.util.Set;

class Student{
	private int rollno;
	private int name;
	private double per;
	private Set<String> skillset;
	public Student(int rollno, int name, double per, Set<String> skillset) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
		this.skillset = skillset;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + ", skillset=" + skillset + "]";
	}
	
		
}
public class Test1 {
	public static void main(String args[]){
		Set<Student> s =new HashSet();
		
	}

}

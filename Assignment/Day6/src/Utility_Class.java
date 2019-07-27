import java.util.*;
class Students{
	private int rollno;
	private int name;
	private double per;
	private Set<String> skillset;
	public Students(int rollno, int name, double per, Set<String> skillset) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
		this.skillset = skillset;
	}
	public Students() {
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

 class Utility_Class<Students> {
private List<Students> list=null;

public Utility_Class() {
	super();
	// TODO Auto-generated constructor stub
}

public Utility_Class(List<Students> list) {
	super();
	this.list = list;
}

public List<Students> getList() {
	return list;
}

public void setList(List<Students> list) {
	this.list = list;
}
public  void createList(){
	Scanner sc=new Scanner(System.in);
	List<Students> list = new ArrayList<>();
	 for(Students x: list){
		 
		list=sc.nextLine; 
	 }
}
public void printList(){
	
}
}


public class Employee {

	private int employeeId;
	private String employeeName;
	private float basicSalary;
	public Employee(int employeeId, String employeeName, float basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void display(){
		System.out.println("Employee Details : " + employeeId + employeeName + basicSalary);
	
	
}
}


public class Manager extends Employee {
	private float petrolAllowance;
	private float foodAllowance;
	private float otherAllowance;
	
	public Manager() {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

	public Manager(float petrolAllowance, float foodAllowance, float otherAllowance,int id, String name, float bs) {
		super(id,name,bs);
		this.petrolAllowance = petrolAllowance;
		this.foodAllowance = foodAllowance;
		this.otherAllowance = otherAllowance;
	}
	
	public void display(){
		super.display();
		System.out.println("Gross Salary : " +calculateGrossSalary() + " and Net Salary: " +calculateNetSalary());
		
	}
	public double calculateGrossSalary(){
		double grossSalary;
		return grossSalary=super.getBasicSalary()+petrolAllowance+foodAllowance+otherAllowance;
		
	}
	public double calculateNetSalary(){
		double netSalary;
		double pf;
		pf=0.125*super.getBasicSalary();
		return netSalary= calculateGrossSalary()-pf;
	
		
		
	}
	
	
}

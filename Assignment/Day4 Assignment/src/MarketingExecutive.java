
public class MarketingExecutive extends Employee{
	private int km;
	private int telAllowance=2000;
	private int ta;
	
	
	public MarketingExecutive(int km, int ta, int telAllowance,int id, String n, float bs) {
		super(id,n,bs);
		this.km = km;
		this.ta = 5*km;
		this.telAllowance = telAllowance;
	}


	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  
	public double calculateGrossSalary(){
		double grossSalary;
		return  grossSalary= super.getBasicSalary()+(km*5)+telAllowance;
		
	}

    public double calculateNetSalary(){
    	double netSalary;
		double pf;
		pf=0.125*super.getBasicSalary();
		return netSalary= calculateGrossSalary()-pf;
    	
		
	}
    public void display(){
		super.display();
		System.out.println("Gross Salary : " +calculateGrossSalary() + " and Net Salary: " +calculateNetSalary());
		
	}

	
}

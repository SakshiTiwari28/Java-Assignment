interface printable{
	public void printDetails();
}


  class CktPlayer implements printable{
	private String name;
	private int runs;
	@Override
	
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Cricket stats");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
} 
  class FtbPlayer implements printable{
	private String name;
	private float goals;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getGoals() {
		return goals;
	}


	public void setGoals(float goals) {
		this.goals = goals;
	}


	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Football stats");
	}
	
}
public class Test2 {
	public static void main(String args[]){
		CktPlayer c=new CktPlayer();
		c.getClass();
		FtbPlayer f=new FtbPlayer();
		f.getGoals();
		c.printDetails();
		f.printDetails();
		
	}

}

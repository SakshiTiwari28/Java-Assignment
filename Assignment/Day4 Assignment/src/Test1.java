

public class Test1 {
	public static void main(String args[]){
		Employee e =new Employee();
		printObject(e);
		Manager m =new Manager(200,500,500,1,"Mishel",5000);
        printObject(m);
        MarketingExecutive me=new MarketingExecutive(5,0,2000,2,"Himanshi",5000);
        printObject(me);
        
		
	}

	private static void printObject(Employee e) {
		// TODO Auto-generated method stub
		e.display();
		
	}

}





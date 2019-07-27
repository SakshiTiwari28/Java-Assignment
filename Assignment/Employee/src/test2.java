
import com.zensar.emp.*;
import com.zensar.emp.sub.*;
import static com.zensar.emp.employee.showemp;
import static java.lang.System.out;
//static method
//static block
//static input
//static instance variable
//initialisation of resources. connectivity happens only once.


public class test2 {
public static void main(String args[]){
	employee e1=new employee();
    employee e2=new employee(1,"Sakshi");
    employee e3=new employee(2,"Himanshi");
    e2.display();
    e3.display();
    e1.display();
    
    showemp();
    out.println("Hello");
    Manager m=new Manager();
	
}
}

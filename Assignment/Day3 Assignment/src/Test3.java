import com.zensar.pack1.*;
import com.zensar.pack2.*;
import static com.zensar.pack2.Batch.fun;
public class Test3 {
public static void main(String args[]){
	Batch b2 =new Batch();
	Batch b3=new Batch();
    Batch b1 =new Batch("JAVA FULL STACK" ,33);
	Student s1 =new Student(100, "Sakshi");
	Student s2=new Student (100,"Sakshi");
	Student s3=new Student (101,"Himanshi");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashcode());
	
	s1.display();
	b2.display();
	b3.display();
	fun();
	
}
}

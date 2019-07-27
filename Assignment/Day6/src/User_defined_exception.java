import java.util.*;
class MyException extends Exception{
	String msg;
	public MyException(String s){
		msg=s;
	}
	public String toString(){
		return msg;
	}
}
public class User_defined_exception {
public static double divide(int num, int den) throws MyException{
	if(den==0)
		throw new MyException ("Denominator is Zero");
	return (double)(num/den);
}
public static void main(String args[]){
try{
	System.out.println(divide(12,0));
}
catch(MyException e)
{
	System.out.println("Exception");
}
}
}

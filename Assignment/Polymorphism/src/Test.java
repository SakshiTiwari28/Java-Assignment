
interface A{
	
}
interface Polygon{
	public abstract double area();
	public abstract double perimeter();
	
		
	}
class B{
	
}
class C{
	
}

	
class Triangle implements Polygon implements  Consumer{
	private int base, height, side1, side2, side3;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int base, int height, int side1, int side2, int side3) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double area()
	{
		return 0.5*base*height;
	}
	public double perimeter(){
		return side1+side2+side3;
	}
	
	
	
}
class Rectangle implements Polygon{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double area(){
		return length*breadth;
	}
	public double perimeter(){
		return 2*(length+breadth);
	}
	
}
class Square extends Rectangle{

	public Square(){
		super();
		
	}
	public Square(int s){
		super(s,s);
	}
public double area(){
	return super.area();
}
public double perimeter(){
	return super.perimeter();
}
	
}
public class Test {
	public static void main(String args[]){
//		Square s= new Square(10);
//		System.out.println(s.area());
//		System.out.println(s.perimeter());
//		String str ="Zensar";
//		str="Technologies";
//		StringBuffer sb =new StringBuffer("zensar");
//		StringBuilder sbb= new StringBuilder("technologies");
		Integer i;

}
}
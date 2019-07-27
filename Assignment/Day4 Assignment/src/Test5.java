class Product implements Cloneable{
	private int id;
	private String name;
	private double cost;
	
	public Object clone() throws CloneNotSupportedException{
      return super.clone();
	}
	public Product(){
		
		}
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public String toString(){
		return "Product id " +id + "Product Name " +name +"Product COst " +cost;
	}
	public double getCost(){
		return cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void setCost(double cost){
		this.cost=cost;
	}
	
		
	}
	
public class Test5 {
public static void main(String args[]) throws CloneNotSupportedException{
	Product p1=new Product(1, "Product1" ,500);
	Product p2=new Product(1,"Product1",500);
	Product p3 =(Product)p1.clone();
	System.out.println(p3);
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    if(p1.equals(p2)){
    	System.out.println("Same");
    	
    }
    else 
    	System.out.println("Not Same");
      

}

}

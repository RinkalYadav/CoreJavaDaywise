package destination.com.nov11;
class Heart{
	double weight;
	String health;
	
	public Heart (double weight,String health) {
	    super();
	    this.weight =weight ;
	    this.health =health;
	}
	public double getWeight() {
		return weight;
	}
	public String getHealth() {
		return health;
	}
	
}

class Brain{
	double weight;
	String health;
	
	public Brain(double weight,String health) {
	    super();
	    this.weight =weight ;
	    this.health =health;
	}
	public double getWeight() {
		return weight;
	}
	public String getHealth() {
		return health;
	}
	
}

class Book{
	String name;
	double cost;
	public Book(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
}

class Bike{
	String name;
	double cost;
	public Bike(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
}

class Student{
	Heart H =new Heart(3,"good");
	Brain B = new Brain(2,"Excelence");
	void hasBook(Book ch) {
		System.out.println(ch.getName());
		System.out.println(ch.getCost());
	}
	void hasBike(Bike ch) {
		System.out.println(ch.getName());
		System.out.println(ch.getCost());
	}
}



public class Lauch2 {

	public static void main(String[] args) {
		Book Bo = new Book ("Java",150);
		Bike Bi=new Bike("Pulser",1000);
		Student su = new Student();
		
		System.out.println(su.H.getWeight());
		System.out.println(su.B.getHealth());
		su.hasBook(Bo);
		su.hasBike(Bi);
		su = null;
		
		System.out.println(Bo.getName());
		System.out.println(Bo.getCost());
		
		System.out.println(Bi.getName());
		System.out.println(Bi.getCost());
		
	}

}
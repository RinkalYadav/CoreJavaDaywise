package Abstraction.oops.nov12;
abstract class Plane1{
	void takeoff() {
	  System.out.println("Plane is takeoff");	
	}
	abstract void fly();// abstract method
	void land() {
		System.out.println("Plane is landed");
	}
}

public class AbstractObject {

	public static void main(String[] args) {
//		Plane1 p1= new Plane1();//can not create the object of abstract class directly
//		Plane1 p2; //reference of the abstract class can be created directly
		
		Plane1 p3 = new Plane1() {
			@Override
			public void fly() {
				System.out.println("Plane is flys");
			}
		};
		System.out.println(p3);
		p3.takeoff();
		p3.fly();
		p3.land();
		
	}

}
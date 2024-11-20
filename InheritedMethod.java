package OopsConcept.com;
class Plane{
	void takeoff() {
		System.out.println("Plane take of ");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landed");
	}
}

class CargoPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Cargo plane fly at the low height");
	}
	void carryGoods() {
		System.out.println("Carr plane carry goods");
	}
}

class PassengerPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Passenger plane fly at the medium height");
	}
	void carryPassenger() {
		System.out.println("Passenger plane carry passenger");
	}
}

class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("fighter plane fly at great height");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons ");
	}
}


public class InheritedMethod {
public static void main(String[] args) {
	CargoPlane cp=new CargoPlane();
	cp.takeoff();
	cp.fly();
	cp.land();
	cp.carryGoods();
	
	PassengerPlane pp=new PassengerPlane();
	pp.takeoff();
	pp.fly();
	pp.land();
	pp.carryPassenger();
	
	FighterPlane fp=new FighterPlane();
	fp.takeoff();
	fp.fly();
	fp.land();
	fp.carryWeapons();
}
}

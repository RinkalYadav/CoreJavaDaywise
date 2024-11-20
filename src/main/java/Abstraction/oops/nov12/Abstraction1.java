package Abstraction.oops.nov12;

abstract class Planethree {
	abstract void takeoff();

	abstract void fly();

	abstract void land();
}

class CargoPlane extends Planethree {
	@Override
	void takeoff() {
		System.out.println("Cargo plane takes off with a long runway.");
	}

	void fly() {
		System.out.println("Cargo plane flies at low height.");
	}

	void land() {
		System.out.println("Cargo plane lands with a heavy load.");
	}

	void carryGoods() {
		System.out.println("Cargo plane carries goods.");
	}
}

class PassengerPlane extends Planethree {
	@Override
	void takeoff() {
		System.out.println("Passenger plane takes off with a moderate runway.");
	}

	void fly() {
		System.out.println("Passenger plane flies at medium height.");
	}

	void land() {
		System.out.println("Passenger plane lands smoothly.");
	}

	void carryPassenger() {
		System.out.println("Passenger plane carries passengers.");
	}
}

class FighterPlane extends Planethree {
	@Override
	void takeoff() {
		System.out.println("Fighter plane takes off with a short runway.");
	}

	void fly() {
		System.out.println("Fighter plane flies at great height.");
	}

	void land() {
		System.out.println("Fighter plane lands swiftly.");
	}

	void carryWeapons() {
		System.out.println("Fighter plane carries weapons.");
	}
}

public class Abstraction1 {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		System.out.println("Cargo plane ==================");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryGoods();

		System.out.println("Passenger plane ============");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryPassenger();

		System.out.println("Fighter plane ============");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}
}


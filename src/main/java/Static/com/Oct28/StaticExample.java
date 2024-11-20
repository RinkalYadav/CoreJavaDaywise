package Static.com.Oct28;

class calculator {
	static int a, b, c; // static variable
	int p, q, r; // non-static variable

	// static block
	static {
		a = 100;
		b = 200;
		c = 300;
		// p=10001; non-static variable
		// q=20002; non-static variable
		// r=30003; non-static variable
	}

	// non-static block
	{
		a = 1001; // static variable
		b = 2002; // static variable
		c = 3003; // static variable
		p = 1000;
		q = 2000;
		r = 3000;
	}

	// static method
	static void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	// non static method
	void display2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}

}

public class StaticExample {
	public static void main(String[] args) {
		System.out.println(calculator.a);
		System.out.println(calculator.b);
		System.out.println(calculator.c);
		System.out.println("=========================");
		calculator.display1();
		System.out.println("=========================");
		calculator ab = new calculator();
		ab.display2();
		System.out.println("=========================");
	}
}

package Interfaces.com.destination.nov13;
// rule:11
interface Calculator1{
	int a=10;
}
// rule:13
interface Operations{
	void op1(); // abstract method(default method of the interface abstract method)
	void op2(); // abstract method(default method of the interface abstract method)
	void op3(); // abstract method(default method of the interface abstract method)
	void op5(); // abstract method(default method of the interface abstract method)
	void op6(); // abstract method(default method of the interface abstract method)
	default void op7() {
		
	}
	static void op8(){
		
	}
}

//rule:14
@FunctionalInterface
interface Operations1{
	void op1(); // abstract method(default method of the interface abstract method)
	
default void op2() {
		
	}
	static void op3(){
		
	}
	
default void op4() {
		
	}
	static void op5(){
		
	}
}

// rule :15
interface Empty{
	
}

class Testing implements Calculator1{
	void disp() {
		System.out.println(a);
		a=200 ; // rule:11
	}
}
public class Testing {

}

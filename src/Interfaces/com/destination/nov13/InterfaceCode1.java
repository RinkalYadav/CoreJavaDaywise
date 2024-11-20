package Interfaces.com.destination.nov13;
interface Calculator{ // rule: 3
	void add(); // rule: 1,2
	void sub();
}
class Calcy1 implements Calculator{  // rule: 4

	@Override
	public void add() {		
	}

	@Override
	public void sub() {
		
	}
	
}

class Calcy2 implements Calculator {  // rule 4

	@Override
	public void add() {
		
	}

	@Override
	public void sub() {
		
	} 
	
}



public class InterfaceCode1 {
	public static void main(String[] args) {
		 //Calculator c=new Calculator(); // rule:5
		Calculator C1; // rule:6
		
		//rule: 7
		Calculator c2=new Calculator() {

			@Override
			public void add() {
				
			}

			@Override
			public void sub() {
				
			}
			
		};
	}

}

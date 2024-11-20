package Interfaces.com.destination.nov13;
// rule : 12
interface Test1{
	void disp1();
	void sub() {
		
	}
}

interface Test2{
	void disp2();
}

// rule:9
interface Test3 implements Test2{
	
}
// rule:10
interface Test4 extends Test2{
	
}

//rule:8
class Sample implements Test1,Test2{

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceCode2 {

}

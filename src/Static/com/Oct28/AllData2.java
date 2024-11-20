package Static.com.Oct28;
import java.util.Scanner;
class Farmer{
	long adh;
	static String nationality="";
	String name=""; 
	String fathername=""; 
	String DOB="";

	static {
		nationality="Indian";
	}
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Adhar Number");
		adh=sc.nextLong();

		System.out.println("Enter the name");
		name=sc.nextLine();
		
		System.out.println("Enter the name father name ");
		fathername=sc.nextLine();
		
		System.out.println("Enter the name DOB ");
		DOB=sc.nextLine();
	}

	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Name = "+fathername);
		System.out.println("Name = "+adh);
		System.out.println("Name = "+DOB);
		System.out.println("Name = "+nationality);
	}
}
public class AllData2 {
	public static void main(String[] args) {
		Farmer f1=new Farmer();
		f1.collectData();
		f1.display();
		System.out.println("======================");

		Farmer f2=new Farmer();
		f2.collectData();
		f2.display();
		System.out.println("======================");

		Farmer f3=new Farmer();
		f3.collectData();
		f3.display();
		System.out.println("======================");

	}
}

package Static.com.Oct28;
class dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	void setData(String name,String color,String breed, int cost, int age) {
		name=name;
		color=color;
		breed=breed;
		cost=cost;
		age=age;
	}
	
	void setName(String name) {
		name=name;
	}
	void setColor(String color) {
           color=color;
	}
	void setBreed(String breed) {
		breed=breed;
	}
	void setCost(int cost) {
		cost=cost;
	}
	void setAge(int age) {
		age=age;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	
}
public class saydoing {
public static void main(String[] args) {
	dog d1=new dog();
	d1.setData("Tomy","Brown", "Pug", 5000, 2);
	d1.getData();
	System.out.println("======================");
	dog d2=new dog();
	d2.setName("Jimmy");
	d2.setColor("White");
	d2.setBreed("GR");
	d2.setCost(6000);
	d2.setAge(5);
	d2.getData();
	
}
}

package Static.com.Oct28;
// by manually add getter and setters 
class dog3{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	void setData(String name,String color,String breed, int cost, int age) {
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost=cost;
		this.age=age;
	}
	
	void setName(String name) {
		this.name=name;
	}
	void setColor(String color) {
           this.color=color;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void setCost(int cost) {
		this.cost=cost;
	}
	void setAge(int age) {
		this.age=age;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	
}
public class sydoing_solution2 {
public static void main(String[] args) {
	dog3 d1=new dog3();
	d1.setData("Tomy","Brown", "Pug", 5000, 2);
	d1.getData();
	System.out.println("======================");
	dog3 d2=new dog3();
	d2.setName("Jimmy");
	d2.setColor("White");
	d2.setBreed("GR");
	d2.setCost(6000);
	d2.setAge(5);
	d2.getData();
}
}

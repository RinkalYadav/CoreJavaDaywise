package Static.com.Oct28;
// by automatically generate setters and getters
class Dog2{
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

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	
}
public class sydoing_solution {
public static void main(String[] args) {
	Dog2 d1=new Dog2();
	d1.setData("Tomy","Brown", "Pug", 5000, 2);
	d1.getData();
	System.out.println("======================");
	Dog2 d2=new Dog2();
	d2.setName("Jimmy");
	d2.setColor("White");
	d2.setBreed("GR");
	d2.setCost(6000);
	d2.setAge(5);
	d2.getData();
}
}
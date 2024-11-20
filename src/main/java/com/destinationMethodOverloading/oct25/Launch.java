package com.destinationMethodOverloading.oct25;
class MethodOverloading{
	int add(int a, int b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	double add(double a, int b) {
		return a+b;
	}

	double add(float a, double b) {
		return a+b;
	}

	double add(double a, double b) {
		return a+b;
	}
	double add(int a,float b, double c) {
		return a+b+c;
	}
	double add(int a, double b, double c) {
		return a+b+c;
	}
	double add(double a, double b, double c) {
		return a+b+c;
	}

}
public class Launch {
	

	public static void main(String[] args) {
		MethodOverloading ab=new MethodOverloading();
		ab.add(5,6);
		ab.add(5,7.5f);
		ab.add(8.9, 8.9);
		

	}
}

package com.destination.sept.oct1;
import java.util.Scanner;
class ArrayOperation1{
	int arr[];
	int size;
	
	void createArray(int n) {
		size=n;
		arr=new int[size];
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting array data :");
		for(int i=0;i<size;i++) {
			System.out.println("enter the marks of student no :"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	void display() {
		System.out.println("Display array data :");
		for(int i=0;i<size;i++) {
			System.out.println("The marks of student no :"+(i+1)+"is ="+arr[i]);
		}
	}
}



public class arrays1st {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the count of student");
	int n=sc.nextInt();
	
	ArrayOperation1 ab=new ArrayOperation1();
	ab.createArray(n);
	ab.addData();
	ab.display();
	
}
}

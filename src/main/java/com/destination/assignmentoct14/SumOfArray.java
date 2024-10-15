package com.destination.assignmentoct14;
import java.util.Scanner;
class sumArray{
	int m[];
	int size;
	int sum=0;
	
	void CreateArray(int n) {
		size=n;
		m=new int[size];
		System.out.println("Array is created successfully");
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array element");
			m[i]=sc.nextInt();	
			}
	}
	
	void display() {
		System.out.println("Array element is ");
		for(int i=0;i<size;i++) {
			System.out.print("  "+m[i]);
		}
		
		System.out.println();
	}
	
	void sum() {
		for(int i=0;i<size;i++) {
			sum=sum+m[i];
		}
		
		System.out.println("Sum of array is "+sum);
	}
}


public class SumOfArray {
	public static void main(String[] args) {
		sumArray ab=new sumArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		ab.CreateArray(n);
		ab.addData();
		ab.display();
		ab.sum();
	}

}

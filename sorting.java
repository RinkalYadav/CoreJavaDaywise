package com.destination.assignmentoct14;
import java.util.Arrays;
import java.util.Scanner;
class sort{
	int m[];
	int size;
	
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
	
	void sorted() {
		 Arrays.sort(m); 
		    System.out.println("Array in ascending order:");
		    for (int i = 0; i < size; i++) {
		        System.out.print(m[i] + " ");
		    }
		    System.out.println(); 

		    System.out.println("Array in descending order:");
		    for (int i = size - 1; i >= 0; i--) {
		        System.out.print(m[i] + " ");
		    }
}

}
public class sorting {
	public static void main(String[] args) {
		sort ab=new sort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		ab.CreateArray(n);
		ab.addData();
		ab.display();
		ab.sorted();
	}

}

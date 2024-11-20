package com.destination.assignmentoct14;
import java.util.Scanner;
class HighArr{
	int m[];
	int size;
	int min=0;
	
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
	
	void checkHigh() {
		for(int i=0;i<size;i++) {
			if(min<m[i]) {
				min=m[i];
			}
			
		}
		System.out.println("The highest value of an array is= "+min);
		
		
	}
}


public class HighestValOfArr {
	public static void main(String[] args) {
		HighArr ab=new HighArr();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		ab.CreateArray(n);
		ab.addData();
		ab.display();
		ab.checkHigh();
	}

}

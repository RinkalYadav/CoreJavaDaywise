package com.destination.sept.oct1;
import java.util.Scanner;
 
class subtr {
	int m1[][];
	int m2[][];
	int res[][]= new int[2][2];
	void createArray() {
		m1=new int[2][2];
		m2=new int[2][2];
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting array data for m1 :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the array data for m1");
				m1[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("Collecting array data for m2 :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the array data m2");
				m2[i][j]=sc.nextInt();
			}
			
		}
		
	}
	
	void sub() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					res[i][j]+=m1[i][k]*m2[k][j];
				}
			}
				
			}
			
		}
		
	
	
	void disply() {
		System.out.println("Subtraction of m1 and m2 matrices");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("  "+res[i][j]);				
			
		}
			System.out.println();
	}
	
	
}


}
public class subtraction {
	public static void main(String[] args) {
		subtr ab=new subtr();
		
		ab.createArray();
		ab.addData();
		ab.sub();
		ab.disply();
	}
	
	
 
}


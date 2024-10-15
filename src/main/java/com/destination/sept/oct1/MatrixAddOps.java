package com.destination.sept.oct1;
import java.util.Scanner;
 
class addition {
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
		
		System.out.println("display the first matrix");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("  "+m1[i][j]);
				
			}
			System.out.println();
		}
	
		
		System.out.println("Collecting array data for m2 :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the array data for m2");
				m2[i][j]=sc.nextInt();
			}
			
		}
		
	}
	
	void add() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				res[i][j]=m1[i][j]+m2[i][j];
			}
			
		}
		
	}
	
	void disply() {
		
		System.out.println("Sum of m1 and m2 matrices");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("  "+res[i][j]);	
			}
			System.out.println();
			
		}
	}
	
	
}



public class MatrixAddOps {
	public static void main(String[] args) {
		addition ab=new addition();
		
		ab.createArray();
		ab.addData();
		ab.add();
		ab.disply();
	}
	
	
 
}

package com.destination.assignmentoct14;
import java.util.Scanner;
class identity{
	int m[][];
	int row;
	int col;
	
	void createArray(int a, int b) {
		 row=a;
		 col=b;
		m=new int[row][col];
		
		
		
	}
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("collecting the array data ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enterr the array value");
				m[i][j]=sc.nextInt();
			}
		}
	}
	
	
	void display() {
		System.out.println("displaying the array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("   "+m[i][j]);
			}
			System.out.println();
		}
	}
	
	void check() {
		 boolean isIdentity = true;
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                if (i == j && m[i][j] != 1) {
	                    isIdentity = false;
	                    break;
	                } else if (i != j && m[i][j] != 0) {
	                    isIdentity = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isIdentity) 
	            System.out.println("The matrix is an identity matrix.");
	         else 
	            System.out.println("The matrix is not an identity matrix.");
	        
	
}
}



public class identityMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number");
		int a=sc.nextInt();
		System.out.println("Enter the column number");
		int b=sc.nextInt();
		identity ab=new identity();
		ab.createArray(a,b);
		ab.addData();
		ab.display();
		ab.check();
		
	}
}



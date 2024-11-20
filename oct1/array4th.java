package com.destination.sept.oct1;
import java.util.Scanner;
class ArrayOperation4{
	String arr[][][];
	int cls;
	int stu;
	int col;
	Scanner sc=new Scanner(System.in);
	
	void createArray(int m, int n, int o) {
		
		arr=new String[m][n][o];
		
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}
	
	void addData() {
		System.out.println("Collecting array data :");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college  no : "+(i));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no "+(j));
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no "+(k));
					arr[i][j][k]=sc.next();
				}
				
			}
			
		}
		System.out.println("Names successfully collected");
		System.out.println("=============");
		
	}
	
	void display() {
		System.out.println("Display array data :");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college  no : "+(i));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no "+(j));
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no "+(k)+"is = "+arr[i][j][k]);
				}	
				
		}
	}
}
}



public class array4th {
	public static void main(String[] args) {
		ArrayOperation4 ab=new ArrayOperation4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the college count ");
		int m=sc.nextInt();
		System.out.println("Enter the class count ");
		int n=sc.nextInt();
		System.out.println("Enter the student count ");
		int o=sc.nextInt();
		ab.createArray(m,n,o);
		ab.addData();
		ab.display();
		
	}
	}




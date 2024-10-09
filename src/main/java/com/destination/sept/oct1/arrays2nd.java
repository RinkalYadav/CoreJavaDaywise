package com.destination.sept.oct1;
import java.util.Scanner;
class ArrayOperation2{
	int arr[][];
	int cls;
	int stu;
	
	void createArray(int n,int m) {
		cls=n;
		stu=m;
		arr=new int[n][m];
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting array data :");
		for(int i=0;i<cls;i++) {
			System.out.println("inside class  no :"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student no"+(i+1));
				arr[i][j]=sc.nextInt();
			}
			
		}
		
	}
	
	void display() {
		System.out.println("Display array data :");
		for(int i=0;i<cls;i++) {
			System.out.println("inside class  no :"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println(" the marks of student no"+(j+1)+"is ="+arr[i][j]);
			}
		}
	}
}



public class arrays2nd {
	public static void main(String[] args) {
		ArrayOperation2 ab=new ArrayOperation2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count ");
		int n=sc.nextInt();
		System.out.println("Enter the student count ");
		int m=sc.nextInt();
		
		
		ab.createArray(n,m);
		ab.addData();
		ab.display();
		
	}
	}



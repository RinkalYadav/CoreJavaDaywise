package com.destination.sept.oct1;
import java.util.Scanner;
 class ArrayOperation3{
	int arr[][];
	int cls;
	Scanner sc=new Scanner(System.in);
	
	void createArray(int n) {
		cls=n;
		
		arr=new int[n][];
		System.out.println("collecting student count for each class :");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter th student count inside class no :"+(i+1));
			int stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}
	
	void addData() {
		System.out.println("Collecting array data :");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class  no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no "+(j+1));
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Marks successfully collected");
		System.out.println("=============");
		
	}
	
	void display() {
		System.out.println("Display array data :");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class  no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" the marks of student no"+(j+1)+" is ="+arr[i][j]);
			}
		}
	}
}



public class arrayjacked {
	public static void main(String[] args) {
		ArrayOperation3 ab=new ArrayOperation3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count ");
		int cls=sc.nextInt();
		ab.createArray(cls);
		ab.addData();
		ab.display();
		
	}
	}




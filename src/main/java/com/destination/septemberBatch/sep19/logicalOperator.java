package com.destination.septemberBatch.sep19;

public class logicalOperator {
	public static void main(String[] args) {
	
		int a=100;
		int b=1000;
		int c=10000;
		System.out.println("logical and operator example");
		boolean res1=(a>b && b>a && b<c);
		System.out.println(res1);
		
		res1=(a<b && b>a && b<c);
		System.out.println(res1);
		System.out.println("=========================");
		System.out.println("Example of or operator ");
		
		boolean res2=(a>b || a<c || c>b);
		System.out.println(res2);
		
		res2=(a>b || b>c || c<a);
		System.out.println(res2);
		
		System.out.println("===============================");
		System.out.println("Example of logical not ");
		boolean res3=!(a>b);
		System.out.println(res3);
		res3=!(a<b);
		System.out.println(res3);
	}
}

package com.destination.septemberBatch.sep19;

public class unaryOperator {
	public static void main(String[] args) {
//		int a=30;
//		int b=a++;
//		System.out.println(a);
//		System.out.println(b);
		
		int a=394;
		int b=a++ + ++a + a-- + --a + --a - a-- + a++ + a++ + ++a - --a - --a - a++;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}

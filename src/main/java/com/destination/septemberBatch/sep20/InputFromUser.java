package com.destination.septemberBatch.sep20;
import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Example of Scanner class");
		System.out.println("==================================================");
		System.out.println("Enter the value of byte ");
		byte b=sc.nextByte();
		System.out.println("The value of byte is ="+b);
		
		System.out.println("==================================================");
		System.out.println("Enter the value of short ");
		short s=sc.nextShort();
		System.out.println("The value of short is ="+s);
		
		System.out.println("==================================================");
		System.out.println("Enter the value of int ");
		int i =sc.nextInt();
		System.out.println("The value of int is ="+i);
		
		System.out.println("==================================================");
		System.out.println("Enter the value of long ");
		long l=sc.nextLong();
		System.out.println("The value of Long is ="+l);
		
		System.out.println("==================================================");
		System.out.println("Enter the value of float ");
		float f =sc.nextFloat();
		System.out.println("The value of float is ="+f);
		
		System.out.println("==================================================");
		System.out.println("Enter the value of double ");
		double d=sc.nextDouble();
		System.out.println("The value of double is ="+d);
	
		System.out.println("==================================================");
		System.out.println("Enter the value of string ");
		String stt=sc.next();
		System.out.println("The value of string is ="+stt);
		
		
	}
	

}

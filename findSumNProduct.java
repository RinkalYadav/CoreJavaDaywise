package com.destinationStringOct15;
import java.util.Scanner;
public class findSumNProduct {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String");
	String str1=sc.nextLine();
	System.out.println("Enter the 2nd String");
	String str2=sc.nextLine();
	String num1="";
	String num2="";
	int number1;
	int number2;
	int sum;
	int multi;
	
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)>=48 && str1.charAt(i)<=57) {
			num1=str1;
		}
	}
	System.out.println("First Numeric String is "+num1);
	
	for(int i=0;i<str2.length();i++) {
		if(str2.charAt(i)>=48 && str2.charAt(i)<=57) {
			num2=str2;
		}
	}
	System.out.println("2nd Numeric String is "+num2);
	
	number1=Integer.parseInt(num1);
	number2=Integer.parseInt(num2);
	
	sum=number1+number2;
	System.out.println("The sum of String is "+sum);
	
	multi=number1*number2;
	System.out.println("The Multiplication of String is "+multi);
	
	
}
}

package com.methodsOfString;
import java.util.Scanner;
public class palindromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String str_temp="";
		int flag=0;
		for(int i=str.length()-1;i>=0;i--) {
			str_temp=str_temp+str.charAt(i);
			
		}
		
		System.out.println("The reverse string is "+str_temp);
		System.out.println("=================================");
		// aproach 1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str_temp.charAt(i)) {
				 flag = 1;
				System.out.println("String is not palindrome");
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("String is palindrome");
		}
		
		// aproach 2
		if(str.equals(str_temp)) {
			System.out.println("String are palindrome string");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}

}

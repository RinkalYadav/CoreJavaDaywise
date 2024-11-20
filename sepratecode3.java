package com.methodsOfString;
import java.util.Scanner;
public class sepratecode3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		
		String str_alpha="";
		String str_numeric="";
		String str_chars="";
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z') ) {
				str_alpha=str_alpha+str.charAt(i);
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				str_numeric=str_numeric+str.charAt(i);
			}
			else {
				str_chars=str_chars+str.charAt(i);
			}
		}
		System.out.println("The alphabetical string is :"+str_alpha);
		System.out.println("The numeric string is :"+str_numeric);
		System.out.println("The special character string is :"+str_chars);
		
	}

}

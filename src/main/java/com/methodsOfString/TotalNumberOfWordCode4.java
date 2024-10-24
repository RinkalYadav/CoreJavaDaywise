package com.methodsOfString;
import java.util.Scanner;
public class TotalNumberOfWordCode4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String ");
			String str=sc.nextLine();
			int count=0;
			str=str.trim();
			for(int i=0;i<str.length();i++) {
				if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
					count++;
				}
				
			}
			System.out.println("The entered word of String is "+(count+1));
		
	}
	
	

}

package com.destinationStringOct15;
import java.util.Scanner;
public class vowel_position {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int total_vowel=0;

		
		str=str.toUpperCase();
		for(int i=0;i<str.length();i=i+2) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || 
						str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
					total_vowel++;
					
				}
				
			}
			
		}
		System.out.println("Total vowel at position of Even number is "+total_vowel);
		
	}

}

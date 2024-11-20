package com.methodsOfString;
import java.util.Scanner;

		class VowelOsp{
			int total_vowel;
			int total_consonat;
			int non_alpha;
			int total_capital_vowel;
			int total_lower_case_vowel;
			
			public void countAllVowels(String str) {
				str=str.toUpperCase();
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)>=65 && str.charAt(i)<=90) {
						if(str.charAt(i)=='A' || str.charAt(i)=='E' || 
								str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
							total_vowel++;
						}
						else {
							total_consonat++;
						}
					}
					else {
						non_alpha++;
					}
				}
				System.out.println("The total vowel count is : "+total_vowel);
				System.out.println("The total consonat count is : "+total_consonat);
				System.out.println("non alpha count is : "+non_alpha);
				System.out.println("======================================================");
			}
			public void capital_vowel(String str) {
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='A' || str.charAt(i)=='E' || 
							str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
						total_capital_vowel++;
					}
				}
				System.out.println("The total capital vowel count is : "+total_capital_vowel);
				System.out.println("========================================================");
			}
			public void lowerCaseVowel(String str) {
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='a' || str.charAt(i)=='e' || 
							str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
						total_lower_case_vowel++;
					}
				}
				
				System.out.println("The total lower case vowel count is : "+total_lower_case_vowel);
				System.out.println("========================================================");
		}
		public void replaceAllVowels(String str) {
			String str_temp="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
						str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||
						str.charAt(i)=='U') {
					str_temp=str_temp+'$';
				}
				else {
					str_temp=str_temp+str.charAt(i);
				}
			}
			str=str_temp;
			System.out.println("The replaced vowel string is :"+str);
			System.out.println("=================================================");
		}
		
		public void replaceUpperCaseVowels(String str) {
			String str_temp="";
			for(int i=0;i<str.length();i++) {
				if(	str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||
						str.charAt(i)=='U') {
					str_temp=str_temp+'$';
				}
				else {
					str_temp=str_temp+str.charAt(i);
				}
			}
			str=str_temp;
			System.out.println("The replaced UpperCase Vowel string is :"+str);
			System.out.println("=================================================");
		}
		
		public void replaceLowerCaseVowels(String str) {
			String str_temp="";
			for(int i=0;i<str.length();i++) {
				if(	str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
						str.charAt(i)=='u') {
					str_temp=str_temp+'$';
				}
				else {
					str_temp=str_temp+str.charAt(i);
				}
			}
			str=str_temp;
			System.out.println("The replaced lowerCase V string is :"+str);
			System.out.println("=================================================");
		}
		
		}
			public class findVowel {
				public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the string");
					String str=sc.nextLine();
					 VowelOsp vo=new  VowelOsp();
					 vo.countAllVowels(str);
					 vo.capital_vowel(str);
					 vo.lowerCaseVowel(str);
					 vo.replaceAllVowels(str);
					 vo.replaceUpperCaseVowels(str);
					 vo.replaceLowerCaseVowels(str);
			
	}

}

package com.destinationStringOct15;

public class Program1 {
	public static void main(String[] args) {
		String s1="Rama";
		String s2="Rama";
		
		int flag=0;
		if(s1.length()==s2.length()) {
			flag=1;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					flag=0;
					break;
				}
				
			}
			if(flag==1) {
				System.out.println("String are equal");
			}
			else {
				System.out.println("String are not equal");
			}
		}
		else {
			System.out.println("String are not equal");
		}
	}

}

package com.destinationStringOct15;

public class Program2 {
public static void main(String[] args) {
	String s1="Rama";
	String s2="Rama";
	if(s1.length()==s2.length()) {
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("---------------------------");
		if(s1==s2) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("refrence are not equal");
		}
	}
	else {
		System.out.println("string are not equal");
	}
}
}

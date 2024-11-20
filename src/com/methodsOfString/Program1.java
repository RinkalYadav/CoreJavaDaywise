package com.methodsOfString;

public class Program1 {
public static void main(String[] args) {
	String str="SachinRameshTendulkar";
	String str3="           ";
	String str4="";
	// to convert string lower to uppercase
	System.out.println(str.toUpperCase());
   //	 to convert string uppercase to lowercase
	System.out.println(str.toLowerCase());
	// to find the length of String
	System.out.println(str.length());
	// to find the character of any String of index number
	System.out.println(str.charAt(7));
	// to check any string are contains in given string or not
	System.out.println(str.contains("Sachin"));
	// to concat a string to another String
	String str2="ArjunTendulkar";
	System.out.println(str.concat("Arjun"));
	System.out.println(str.concat(str2));
	// startswith by 
	System.out.println(str.startsWith("Sachin"));
	// endswith by
	System.out.println(str.endsWith("Tendulkar"));
	// getclass
	System.out.println(str.getClass());
	// hash code of given string
	System.out.println(str.hashCode());
	// find index number of any given char in string
	System.out.println(str.indexOf("a"));
	// isBlank
	System.out.println(str3.isBlank());
	// isEmpty
	System.out.println(str3.isEmpty());
	System.out.println(str4.isEmpty());
	// last indexOf
	System.out.println(str.lastIndexOf("a"));
	
}
}

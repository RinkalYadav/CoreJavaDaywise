package com.destinationStringOct15;

public class Program24Oct {
public static void main(String[] args) {
	String s1="sita";
	String s2="Ravana";
	s1=s1.concat(s2);
	System.out.println(s1);
	
	
	StringBuffer sb1= new StringBuffer("sita");
	StringBuffer sb2= new StringBuffer("Ravana");
	sb1.append(sb2);
	System.out.println(sb1);
	
	
	
	StringBuilder sbd1= new StringBuilder("sita");
	StringBuilder sbd2= new StringBuilder("Ravana");
	sbd1.append(sbd2);
	System.out.println(sbd1);
	
}
}

package com.destination.sep25;
import java.util.Scanner;
public class pattern18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
					System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	

}

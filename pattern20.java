package com.destination.sep25;
import java.util.Scanner;
public class pattern20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("- ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	

}


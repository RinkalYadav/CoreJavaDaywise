package com.destination.sep25;
import java.util.Scanner;
public class pattern14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1|| j==1 || i==n || j==n) {
					System.out.print("# ");
				}
				else {
					System.out.print("_ ");
				}
				
			}
			System.out.println();
		}
	}
	
	

}

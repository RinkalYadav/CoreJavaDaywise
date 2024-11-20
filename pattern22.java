package com.destination.sep25;
import java.util.Scanner;
public class pattern22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("# ");
			}
			for(int l=n;l>=i;l--) {
				System.out.print("- ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("- ");
			}
			for(int k=n;k<=2*n-1;k--) {
				System.out.print("# ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("- ");
			}
		
	}

	}}

package com.destination.sep25;
import java.util.Scanner;
public class pattern11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k--+" ");
			}
			System.out.println();
		}
	}

}

package com.destination.sept.oct1;
import java.util.Scanner;
public class feedback2 {
	//You made this easy to understand
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows (odd number):");
        int n = sc.nextInt();
        if (n % 2 == 0 || n < 3) {
            System.out.println("Please enter a valid odd number greater than or equal to 3.");
            
        }
        else {
        	
        
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j)&&(j<=n/2) || (i+j==n-1)&&(j>=n/2) || (j==n/2)&&(i>=n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j > 0 && j < n - 1|| j==0 && i > 0 && i < n - 1|| i==n-1 && j > 0 && j < n - 1|| j==n-1 && i > 0 && i < n - 1) {
					System.out.print("* ");
				} 
				else {
					System.out.print("  ");
				}
			}
		
			
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==n-1)&&(j<=n-1) || j==n-1) {
					System.out.print("* ");
				}	
				else {
					System.out.print("  ");
				}
			}
			
		
		
			
			
			
			
			
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if((j==0 || j==n/2)&&(i!=0) || (i==0)&&(j>0&&j<=n/2-1) || (i==n/2) && (j<=n/2) ) {
					System.out.print("* ");
				}
				
				
				else {
					System.out.print("  ");
				}
			}
//			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || (j==n/2)&&(i<=n/2) ||i-j==n/2 ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
//			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || ((i==n-1)&&(j<=n/2)) ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==n/2) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( j==0 || j==n-1 || (i==n/2)&&(j<=n-1)) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || ((i==n-1)&&(j<=n/2)) ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || (i==0)&&(j<=n/2) || j==n/2 || (i==n/2) && (j<=n/2) || ((i==n-1)&&(j<=n/2))) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
//			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || ((i==n-1)&&(j<=n/2)) ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
//			
			for(int j=0;j<n;j++) {
				if(i==0 || (j==0)&&(i<=n/2) || i==n/2 || (j==n-1)&&(i>=n/2) || i==n-1) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==n/2) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j > 0 && j < n - 1|| j==0 && i > 0 && i < n - 1|| i==n-1 && j > 0 && j < n - 1|| j==n-1 && i > 0 && i < n - 1) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==j ||  j==n-1) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || ((i==n-1)&&(j<=n/2)) ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || (j==0)&&(i<=n/2) || i==n/2 || (j==n-1)&&(i>=n/2) || i==n-1) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==n/2) {
					System.out.print("* ");
				} 
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0) || ((i==0)&&(j<=n/2)) || ((i==n/2) && (j<=n/2)) || (j==n/2)&&(i<=n/2) ||i-j==n/2 ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}
        }
		
	}

}


package Navratri;
import java.util.Scanner;
public class Navratri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Enter a number for celebrating Navratri With Rinkal Yadav");
		int n=sc.nextInt();
		if(n<3 || n%2==0) {
			System.out.println("Plz Enter only odd number");
		}
		else {
			
	
		
			for(int i=0;i<n;i++) {
				System.out.print("                                   ");
				for(int j=0;j<n;j++) {
					if( j==0 || j==n/2 || (i==n/2)&&(j<=n/2)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if( ((j==0)||(j==n/2))&&(i!=0) || (i==0)&&(j>0&&j<=n/2-1) || (i==n/2)&&(j<=n/2)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(j==0 || (i==0)&&(j<=n/2) || (j==n/2 && i<=n/2) || i==n/2&&j<=n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(j==0 || (i==0)&&(j<=n/2) || (j==n/2 && i<=n/2) || i==n/2&&j<=n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(i-j==0&&j<=n/2 || i+j==n-1 && j>=n/2 || j==n/2&&i>=n/2 ) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	System.out.println();
	        	
				
			}
			System.out.println();
        	System.out.println();
        	System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print("            ");
				for(int j=0;j<n;j++) {
					if(j==0 ||j==n-1 ||i-j==0) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				System.out.print("  ");
				for(int j=0;j<n;j++) {
					if( ((j==0)||(j==n/2))&&(i!=0) || (i==0)&&(j>0&&j<=n/2-1) || (i==n/2)&&(j<=n/2)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(j==0&&i<=n/2 || j==n-1&&i<=n/2 || i-j==n/2 || i+j==n-1+n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) {
					if(j==0 || (i==0)&&(j<=n/2) || (j==n/2 && i<=n/2) || i==n/2&&j<=n/2 || i-j==n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if( ((j==0)||(j==n/2))&&(i!=0) || (i==0)&&(j>0&&j<=n/2-1) || (i==n/2)&&(j<=n/2)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(i==0 || j==n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) {
					if(j==0 || (i==0)&&(j<=n/2) || (j==n/2 && i<=n/2) || i==n/2&&j<=n/2 || i-j==n/2) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				for(int j=0;j<n;j++) {
					if(i==0 || j==n/2 || i==n-1) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}	
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("                                         Congrates, you celebrated Navratri With Rinkal Yadav");
		}
		}

}

package com.destination.assignmentoct14;
import java.util.Scanner;
class duplicate{
	int m[];
	int size;
	int dub[];
	int count;
	
	
	
	void createArray(int n){
		size=n;
		m=new int[size];
		System.out.println("Array is created successfully");
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array element");
			m[i]=sc.nextInt();	
			}
	}
	
	void display() {
		System.out.println("Array element is ");
		for(int i=0;i<size;i++) {
			System.out.print("  "+m[i]);
		}
		
		System.out.println();
	}
	
	void checkdup(){
	    dub=new int[size];
	    count=0;
		boolean value=false;
		System.out.println("found duplicate elemenent is ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
					if(m[i]==m[j]) {
					   boolean alreadyadded=false;
					   for(int k=0;i<count;i++) {
					    	 if(dub[k]==m[i]) {
					    		 alreadyadded=true;
					    		 break;
					    	 }
					    	
					    }
						
					   if (alreadyadded==false) {
		                    dub[count] = m[i];
		                    System.out.print(" " + dub[count]);
		                    count++;
		                }
		                value = true;
					}
				}
				
				
			}
		if(value==false) {
			System.out.println("Duplicate element not found");
		}
			
		
	}
	
	
}


public class duplicateElmOfArr {
	public static void main(String[] args) {
		duplicate ab=new duplicate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		ab.createArray(n);
		ab.addData();
		ab.display();
		ab.checkdup();
	}
	

}

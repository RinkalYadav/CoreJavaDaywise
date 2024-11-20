package com.destination.assignmentoct14;
import java.util.Scanner;
class unique{
	int m[];
	int size;
	int uniq[];
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
	
	void uniqu() {
	    uniq = new int[size];
	    count = 0;
	    boolean value = false;
	    
	    System.out.println("After removing duplicate elements:");
	    
	    for (int i = 0; i < size; i++) {
	        boolean alreadyAdded = false;
	        
	       
	        for (int k = 0; k < count; k++) {
	            if (uniq[k] == m[i]) {
	                alreadyAdded = true;
	                break;
	            }
	        }
	        
	        
	        if (alreadyAdded==false) {
	            uniq[count] = m[i];
	            count++;
	        }
	    }

	   
	    System.out.println("Array after removing duplicates:");
	    for (int k = 0; k < count; k++) {
	        System.out.print(uniq[k] + " ");
	    }
	    System.out.println();
	}

	
}


public class removeDupArr {
	public static void main(String[] args) {
		unique ab=new unique();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		ab.createArray(n);
		ab.addData();
		ab.display();
		ab.uniqu();
	}
	

}

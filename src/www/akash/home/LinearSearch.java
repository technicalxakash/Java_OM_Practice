package www.akash.home;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("enter the elemsts of an array");
		
		for(int i=0;i<n;i++) {
			System.out.print("enter the element at "+(i+1)+" :");
			 arr[i]=sc.nextInt();
		}
		System.out.println("enter the key to be search in array");
		int key=sc.nextInt();
		 boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("array key found at index  : "+i);
				 found=true;
				break;				
			}			
			}
		if (found) {
            System.out.println("Key is  found in the array.");
		}
		else {
			System.out.println("Key is found in the array.");
		}
		

	}

}

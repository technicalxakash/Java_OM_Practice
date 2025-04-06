package www.akash.home;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("enter the elemsts of an array");
		
		for(int i=0;i<n;i++) {
			System.out.print("enter the element at "+(i+1)+" :");
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) { //i < arr.length - 1 it does not include last elememnt
			 for(int j=0;j<a.length-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
				 
			 }
					 
		}
		 System.out.println("sorted array is ");

		 System.out.println(Arrays.toString(a));
		 System.out.println(a[0]);
		 System.out.println(a[n-1]);
	 
	}

}

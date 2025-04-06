/*
 * package www.akash.home;
 * 
 * public class Array {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * int i; int a[]=new int[5]; a[0]=12; a[1]=34; a[4]=67;
 * 
 * //accessing one values System.out.println("Element at index "+a[2]);
 * //accessing all the array elements for( i=0;i<a.length;i++) {
 * 
 * System.out.println("Element at index " + (i+1) + " = " + a[i]);
 * 
 * } //sum manually int sum=a[0]+a[1]+a[2]+a[3]+a[4];
 * System.out.println("the total sum manually  "+ sum);
 * 
 * //sum using for loop int sum1=0; for(i=0;i<a.length;i++) { sum1=sum1+a[i]; }
 * System.out.println("the total sum using for loop is "+sum1); }
 * 
 * }
 

//sum of an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
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
	int sum=0;
	
	
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("the sum of the array is "+sum);
	
	
}}


//average of an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	System.out.println("enter the elemsts of an array");
	int sum=0;
	float avg=0;
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		
		
		System.out.print("enter the index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		
		sum=sum+a[i];
		}
	avg=(sum/n);
	System.out.println("the average of array is "+avg);
	}
}

//reversing an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	
	int a[]=new int[] {1,2,3,45,4};
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}}



package www.akash.home;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
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
	int sum=0;
	
	
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("the sum of the array is "+sum);
	//arrays.toString()=to print in a arrays form
	System.out.println(Arrays.toString(a));
	
	
}}



//joining two array into single arrays
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the size of an array1 : ");
	int n1=sc.nextInt();
	String[] arr1=new String[n1];
	for(int i=0;i<n1;i++) {
		System.out.println("enter the arr1 of index of  "+(i+1)+" : ");
		arr1[i]=sc.next();
	}
	
	
	System.out.println("enter the size of an array2 : ");
	int n2=sc.nextInt();	
	String[] arr2=new String[n2];	
	for(int i=0;i<n2;i++) {
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		arr2[i]=sc.next();
	}
	
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println("after joing arr1 and arr2 with arr3");
	
	String[] arr3=new String[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++) {
		arr3[i+arr1.length]=arr2[i];
	}
	System.out.println(Arrays.toString(arr3));
	
}}

//largest number in given array
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) {
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int largestnum=a[0];
	int maxIndex=0;
	int secondLargest=a[0];
	int secondMaxIndex=0;
	for(int i=0;i<a.length;i++) {
		if(largestnum<a[i]) {
			largestnum=a[i];
			maxIndex=i;
		}
	
    }
		
	}System.out.println("the largest value in given array is :  "+largestnum);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	
}}


package www.akash.home;
import java.util.Arrays;


public class Array {
  
public static void main(String[] args) { 
	
	int[] a=new int[] {2,4,23,65,76};
	int max=a[0];
	int secondMax=a[1];
	  for (int i = 0; i < a.length; i++) {
          if (a[i] > max) {
              secondMax = max; // Update second largest before replacing largest
              max = a[i];
          } else if (a[i] > secondMax && a[i] != max) {
              secondMax = a[i];
          }
      }
	System.out.println("second maximum elemets is "+secondMax);
	
}
}

//largest number in given array
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array{
  
public static void main(String[] args) { 
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) 
	{
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int largestnum=a[0];
	int maxIndex=0;

	for(int i=0;i<a.length;i++) {
		if(largestnum<a[i]) {
			largestnum=a[i];
			maxIndex=i;
		}
	
    }
	System.out.println("the largest value in given array is :  "+largestnum);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	}

	
}

//second largest number 
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array{
  
public static void main(String[] args) { 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) 
	{
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int max1=0;
	int max2=0;
	int maxIndex=0;
	int maxIndex2=0;
	
	if(a[0]>a[1]) {
		max1=a[0];
		max2=a[1];
	}
	else {
		max1=a[1];
		max2=a[0];
	}
	for(int i=2;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
			maxIndex=i;
			
		}
		else if(a[i]>max2){
			
			max2=a[i];
			maxIndex2=i;
		}
	}
	System.out.println("the firstlargest element is"+max1);
	System.out.println("the secondlargest element is"+max2);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	System.out.println("the Secondlargest value index  in given array is : "+maxIndex2);
}}


package www.akash.home;

public class Array {
 
public static void main(String[] args) {
//2D array	 
	int arr[][]=new int[3][2];
	arr[0][0]=1;
	arr[0][1]=2;
	
	arr[1][0]=1;
	arr[1][1]=2;
	
	arr[2][0]=1;
	arr[2][1]=2;
	
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
System.out.println("==============================");
//or	


	int arr1[][]= {
			{1,2},
			{3,4},
			{5,6}
	};
	int size=0;
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+" ");
			size+=1;
		}
		System.out.println();
	
		
		
	}
	System.out.println(size);
 }
 
 }



package www.akash.home;

public class Array {
 
public static void main(String[] args) {
	
//jagged array	 
		int arr[][]=new int[3][];
		
		 arr[0] = new int[3];  
	     arr[1] = new int[5];  
	     arr[2] = new int[2];
	     
	     
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=4;
		
		arr[1][0]=1;
		arr[1][1]=2;
		arr[1][2]=2;
		arr[1][3]=2;
		arr[1][4]=2;
		
		arr[2][0]=1;
		arr[2][1]=2;
		int size=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				size+=1;
			}
			System.out.println();
		
			
			
		}
		System.out.println(size);
		
		System.out.println("===================================="); 
		//or
		int arr1[][]= {
				{1,2},
				{3,4,45,2,452,5},
				{5,6,6,5}
		};
		int sizee=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
				sizee+=1;
			}
			System.out.println();
		
			
			
		}
		System.out.println(sizee);
	 }
	 
	 
}
*/
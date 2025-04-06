package www.akash.home;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/*for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		
	
	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10 
	//11 12 13 14 15
	int count=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.printf("%3d",count);
			count++;
			
		}
		System.out.println("");
		
	}
	
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<=50;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		for(int i=1;;) {
			if(i<=3) {
				System.out.println(i);
				i++;
			}
			
		}
		
		
		int i;
		int j;
		int count=1;
		for(i=0;i<=6;i++) {						
			for(j=1;j<=i;j++) {
				System.out.printf("%3d",+count);
				count++;
				
			}
			System.out.println();
		}
		  1
		  2  3
		  4  5  6
		  7  8  9 10
		 11 12 13 14 15
		 16 17 18 19 20 21
		
		

		        int i, j, k;
		        int z = 1; // Controls the number of stars

		        for (i = 1; i <= 6; i++) {
		            // Print leading spaces
		            for (j = 6 - i; j >= 1; j--) {
		                System.out.print(" ");
		            } 					
		            
		            // Print stars
		            for (k = 1; k <= z; k++) {
		                System.out.print("*");
		            }
		            z += 2; // Increase the number of stars for the next row
		            System.out.println(); // Move to the next line
		        }

		        
		         *
		        ***
		       *****
		      *******
		     *********
		    ***********
		        for (i = 0; i < 6; i++) {
		            // Print leading spaces
		            for (j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (k = 0; k < (2 * (6 - i) - 1); k++) {
		                System.out.print("*");
		            }
		            System.out.println(); // Move to the next line
		            
		           ***********
		            *********
		             *******
		              *****
		               ***
		                *
		        } 
		int i,j;
		
		for(i=1;i<=5;i++) {
			int count=i;
			for(j=1;j<=5;j++) {
				
				System.out.print(count+" ");
				count=count+5;
			}
			
			System.out.println();
		}
		    
	
	}

1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 
		
int i,j;
		int count=1;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}	
}
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
		
				
		
		*/
		int i,j;
		int z=1;
		int k;
		for(i=0;i<=5;i++) {
			for(j=5
					
					
					
					
					
					;j>=i;j--) {
				
				System.out.print(" ");
			}
			 for (k = 1; k <= z; k++) {
	                System.out.print("*");
	            }
	            z += 2; // Increase the number of stars for the next row
	            System.out.println();
	}
}}
//* * * * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

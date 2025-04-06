
/*

check prime number or not
package www.akash.home;

import java.util.Scanner;

public class PrimeNoo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n=sc.nextInt();

		int no_of_dividents=0;
		 
			if(n!=1 && n!=2) {
				for(int i=1;i<=n;i++) {
					
					if(n%i==0) {
						no_of_dividents++;
						
					}
				}
				if(no_of_dividents>2 || no_of_dividents==0) {
					System.out.println("it is not a prime number");
				}
				else {
					System.out.println("it is  prime number");
				}
			}
		
		

	}

}


check prime from startingNumber and EndingNumber if prime number print all the number between between them
package www.akash.home;

import java.util.Scanner;

public class PrimeNoo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the startingNumber  : ");
		int startingNumber=sc.nextInt();
		System.out.println("Enter the EndingNumber  : ");
		int EndingNumber=sc.nextInt();
		
		for(int num=startingNumber;num<=EndingNumber;num++) {
			int no_of_dividents=0;
			 
			if(num!=1 && num!=2) {
				for(int i=1;i<=num;i++) {
					
					if(num%i==0) {
						no_of_dividents++;
						
					}
				}
				if(no_of_dividents<=2 && no_of_dividents!=0) {
					System.out.println(num);
				}
				
			}
			
		}
	}}
*/
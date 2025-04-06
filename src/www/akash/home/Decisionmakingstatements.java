/*
package www.akash.home;

import java.util.Scanner;

public class Decisionmakingstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the marks of a student  : ");
		int marks=sc.nextInt();
		if(marks<35)System.out.println("Student is failed");
		else if(marks==35)System.out.println("Student is pass");
		else if(marks>35 && marks<70) System.out.println("Student secured third class");
		else if(marks>=70 && marks<=85) System.out.println("Student secured second class");
		else if (marks>85)System.out.println("Student is first class");
		else System.out.println("Student is failed");
		
		
		sc.close();

	}

}
*/

package www.akash.home;

import java.util.Scanner;

public class Decisionmakingstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the day  : ");
		String day=sc.next();
		if(day.equals("satday") ||day.equals("sunday")) System.out.println("Yayy, it's a weekend");
		else System.out.println("Uff,it's a weekday");
		sc.close();

	}

}

	

/*
package www.exception.hand;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result;
		result=fnumber/snumber;
	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}
*/

/*Program Started execution
Exception in thread "main" java.lang.ArithmeticException: / by zero
at www.exception.hand.Exception.main(Exception.java:10)
*/

//Exception handling
//we use  try,catch ,finally
/*
synatx= try {
	which code will throws an exception that code is kept in try
}
*/


//stacktrace
/**
 * Exception name=java.lang.ArithmeticException
 * exception message =/ by zero
 * which line number=
 * methods info=
 * 
 * @param args
 */

package www.exception.hand;

public class Exception {
	
	
	
	public static void test() {
		
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result;
		result=fnumber/snumber;
	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
}
	
	public static void test2() {
		
		test();
	}
	
public static void main(String[] args) {
	test2();
	
	
}}


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
 * at www.exception.hand.Exception.test(Exception.java:55)
	at www.exception.hand.Exception.test2(Exception.java:62)
	at www.exception.hand.Exception.main(Exception.java:66)

 * @param args
 */
/*
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
*/




/*
package www.exception.hand;

public class Eexception {

	public static void main(String[] args) {
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result = 0;
		try {
		result=fnumber/snumber;
		}
		
		catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        }

	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}

output=Program Started execution
java.lang.ArithmeticException: / by zero
output is : 0
Program excecution ended



//finally
package www.exception.hand;

public class Eexception {

	public static void main(String[] args) {
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result = 0;
		try {
		result=fnumber/snumber;
		}
		
		catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        }
		finally {
			System.out.println("Akash is a good boy");
		}

	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}
*/

//throw
/*
package www.exception.hand;

public class Eexception {

	public static void main(String[] args) {
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result = 0;
		try {
		result=fnumber/snumber;
		}
		
		catch (ArithmeticException ae) {
            System.out.println(ae.toString());
            throw ae;
        }
		finally {
			System.out.println("Akash is a good boy");
		}

	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}

Program Started execution
java.lang.ArithmeticException: / by zero
Akash is a good boy
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at www.exception.hand.Eexception.main(Eexception.java:148)

*/

/*
//mandatory blocks

//1)if try is there finally or catch should be there else error
package www.exception.hand;

public class Eexception {

	public static void main(String[] args) {
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result = 0;
		try {
		result=fnumber/snumber;
		}
		
		
		

	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}

output=Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert "Finally" to complete TryStatement

	at www.exception.hand.Eexception.main(Eexception.java:189)


*/


package www.exception.hand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eexception {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		System.out.println("Program Started execution");
		int fnumber=9;
		int snumber=0;
		int result = 0;
		
		
		File file=new File("F:/resume-akashrr.docx");
		FileInputStream fis=new FileInputStream(file);
		System.out.println(fis);
		try {
			result=fnumber/snumber;
			}
			
			catch (ArithmeticException ae) {
	            System.out.println(ae.toString());
	            throw ae;
	        }
			finally {
				System.out.println("Akash is a good boy");
			}
		
		
		

	  System.out.println("output is : "+result);
	  System.out.println("Program excecution ended");
	}

}


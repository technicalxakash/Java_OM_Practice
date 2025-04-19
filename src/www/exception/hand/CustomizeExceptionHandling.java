package www.exception.hand;

public class CustomizeExceptionHandling {

	public static void main(String[] args) throws Exception {
		/*
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[2]/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
*/
		
		
		/*
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[2]/0);
		} catch (ArithmeticException e) {
			
			throw new ArithmeticException("Stupid fellow dont divide the number by zero");
		}
		output=Exception in thread "main" java.lang.ArithmeticException: Stupid fellow dont divide the number by zero
				at www.exception.hand.CustomizeExceptionHandling.main(CustomizeExceptionHandling.java:20)
				
				*/
		
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[2]/0);
		} catch (ArithmeticException e) {
			
			throw new LoginException("Stupid fellow dont divide the number by zero");
		}
	}

}

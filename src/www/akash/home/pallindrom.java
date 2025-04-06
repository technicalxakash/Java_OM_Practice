package www.akash.home;

public class pallindrom {

	public static void main(String[] args) {
		String str="acecar";
		char[] arr=str.toCharArray(); //The toCharArray() method in Java converts a string into a character array, 
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i];
		}
		if(str.equals(rev)) {
		System.out.println("it is palidrome");
		}
		else {
			System.out.println("it is not palidrome");
	
		}

	}

		}



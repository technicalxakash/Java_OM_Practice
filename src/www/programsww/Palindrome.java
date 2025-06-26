package www.programsww;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="racecar";
		String str2="";
		char ch;
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			str2=str2+ch;
			
		}
		
		
if(str.equals(str2)) {
	System.out.println("It is a palindrome");
}
else {
	System.out.println("it is not palindrome");
}

	}

}

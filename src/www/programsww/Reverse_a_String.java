package www.programsww;

public class Reverse_a_String {

	public static void main(String[] args) {
		String str="akash";
		String rev="";
		char ch;
			for(int i=str.length()-1;i>=0;i--) {
				ch=str.charAt(i);
				rev=rev+ch;

			}
			System.out.println(rev);
			
	}

}

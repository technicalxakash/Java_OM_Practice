package www.programsww;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
				
			String str1="slient";
			
			str1.length();
			
			String str12="";
			String str13="";
			
		String str2="listen";
		str2.length();
		
		if(str1.length()==str2.length()) {
			
			char [] ch1=str1.toCharArray();
			Arrays.sort(ch1);
			
			char [] ch2=str2.toCharArray();
			Arrays.sort(ch2);
			
			String str = new String(ch1);
			String str11 = new String(ch2);
			
			
			if (str.equals(str11)) {
                System.out.println("It is an anagram");
            } 
		}
		else {
			System.out.println("It is not a anagram");
		}
	}

}

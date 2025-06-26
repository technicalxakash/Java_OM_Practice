package www.programsww;

public class Rverese_a_Number {

	public static void main(String[] args) {
	
		int num=1234;
		int rev=0;
		int lastdigi=0;
		while(num>0) {
			lastdigi=num%10;
			rev=lastdigi;
			num=num/10;
			System.out.print(rev);
		}

	}

}

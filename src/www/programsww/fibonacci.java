package www.programsww;

public class fibonacci {

	public static void main(String[] args) {
		int firstnumber=0;
		int secondnumber=1;
		int sum=0;
		for(int i=0;i<=10;i++) {
         System.out.println(firstnumber);
         sum=firstnumber+secondnumber;
         firstnumber=secondnumber;
         secondnumber=sum;
		}

	}

}

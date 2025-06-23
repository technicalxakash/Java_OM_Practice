package www.programsww;

public class ArmStrongNumer {

	public static void main(String[] args) {
		
		int num=153;
		int copy=num;
		int lastdgi=0;
		int count=0;
		int armnum=0;
		int sum=0;
		while(num>0) {
			lastdgi=num%10;
			count=count+1;
			num=num/10;		
		}

		while(copy>0) {
			lastdgi=copy%10;
			armnum=(int) Math.pow(lastdgi, count);
			sum=sum+armnum;
			copy=copy/10;
			
			
		}
		System.out.println(sum);
	}

}

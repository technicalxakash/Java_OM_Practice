package www.programsww;

public class ArmStrongNumer {

	public static void main(String[] args) {
		
		int num=153;
		int copy=num;
		int lastdigi=0;
		int count=0;
		int armnum=0;
		
		while(num>0) {
			lastdigi=num%10;
			count=count+1;
			num=num/10;
			
		}
		int sum=0;
		while(copy>0) {
			lastdigi=copy%10;
			armnum=(int) Math.pow(lastdigi, count);
			sum=sum+armnum;
			copy=copy/10;
			
		}
		System.out.println(sum);
		
	}

}

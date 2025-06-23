package www.programsww;

public class PM {

public boolean prime(int n) {
	
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	
}	
	
	public static void main(String[] args) {
		PM p=new PM();
//		System.out.println(p.prime(12));
		
		for(int i=2;i<=20;i++) {
			if(p.prime(i)==true)
			System.out.println(i);
		}

	}

}

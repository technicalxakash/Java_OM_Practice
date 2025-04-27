package www.oops.com;

public class polyMorphism {

	public int add(double a , int b) {
		return(int)(a+b);
		
	}
public float add(float a , int b) {
		
	return(a+b);
	}
	public static void main(String[] args) {
		
		polyMorphism pl=new polyMorphism();
		System.out.println(pl.add(10,20));
		System.out.println(pl.add(10.2,9));
	}

}

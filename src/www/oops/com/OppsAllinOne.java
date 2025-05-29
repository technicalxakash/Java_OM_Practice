package www.oops.com;
import java.util.Scanner;
interface shapes{
	public double area;
	Scanner sc=new Scanner(System.in);
	public abstract void collect();
	public abstract void  calculate();
	
	void display() {
		
		System.out.println("the area is :"+area);
		
	}
}


class Circle extends Shapes{
	private double r;
	private final double pi=3.14768;
	
	@Override
	void collect() {
		System.out.println("Enter the radius : ");
		r=sc.nextDouble;
	}
}

public class OppsAllinOne {

	public static void main(String[] args) {
		

	}

}

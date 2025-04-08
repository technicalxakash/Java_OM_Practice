package www.abstarctionn.com;

public abstract class SampleAC implements Laptop{
	public void copy() {
		System.out.println("It will copy");
		
	}
	public void paste() {
		
		System.out.println("it will able to paste");
	}
	
	public abstract void cut();
	
	public abstract void keyboard();
}

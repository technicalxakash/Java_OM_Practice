package www.iinterface.com;

public class Hp implements Laptop{
	@Override
	public void copy() {
		System.out.println("hp copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("hp paste code");
		
	}

	@Override
	public void cut() {
		
		System.out.println("hp cut code");
	}
	
	
}

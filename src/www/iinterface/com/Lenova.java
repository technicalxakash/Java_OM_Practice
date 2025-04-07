package www.iinterface.com;

public class Lenova implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenova copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenova paste code");
		
	}

	@Override
	public void cut() {
		
		System.out.println("Lenova cut code");
	}
	
	@Override
	public void security() {
		System.out.println("Lenova secuirty code");
	}
}

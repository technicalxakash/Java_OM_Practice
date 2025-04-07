package www.iinterface.com;

public class Apple implements Laptop {

	@Override
	public void copy() {
		System.out.println("apple copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("apple paste code");
		
	}

	@Override
	public void cut() {
		
		System.out.println("apple cut code");
	}
	
	@Override
	public void security() {
		System.out.println("apple secuirty code");
	}
}

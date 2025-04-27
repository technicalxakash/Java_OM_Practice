package www.oops.com;

interface Laptop{
	
	public abstract void copy();
	public abstract void paste();
	public abstract void run();
	public abstract void ctrlz();
	
}

public abstract class Abstarctttt implements Laptop{
	public  void copy() {
		System.out.println("Lenova can copy");
		
	}
	public void paste() {
		
		System.out.println("Lenova can paste");
	}
	public abstract void run();
	public abstract void ctrlz();
	
	public static void main(String[] args) {
		Abstarctttt n=new Abstarctttt() {
			 @Override
	            public void run() {
	                System.out.println("Anonymous Lenovo is running");
	            }

	            @Override
	            public void ctrlz() {
	                System.out.println("Anonymous Lenovo undo operation");
	            }
			
		};
		n.copy();
		n.paste();
		n.run();
		n.ctrlz();
        
	}

}

//output=Lenova can copy
//Lenova can paste
//Anonymous Lenovo is running
//Anonymous Lenovo undo operation


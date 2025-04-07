package www.iinterface.com;

public interface Laptop {
public void copy();
public void paste();
public void cut();



default void security() {
	commonCode();
	System.out.println("Laptop secuirty code");
}

static void Printing() {
	commonCode();
	System.out.println("it can have the ability to print");
}

private static void commonCode() {
	System.out.println("CommonCode");
}
}

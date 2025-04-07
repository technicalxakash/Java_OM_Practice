package www.iinterface.com;

public interface Laptop {
public void copy();
public void paste();
public void cut();



default void security() {
	commonCode();
	System.out.println("Laptop secuirty code");
}
//from java 1.8 we can implements the ,ethods in interface
static void Printing() {
	commonCode();
	System.out.println("it can have the ability to print");
}
//from java 1.9 we can use private acces modifier to represent same code in all the methods
private static void commonCode() {
	System.out.println("CommonCode");
}
}

/*
package www.akash.home;

class A{
	
	public A() {
		
		System.out.println("this is a");
	}
}
class B extends A{
	
	public B() {
		
		System.out.println("this is b");
	}
}
public class ThisAndSuper {

	
	public static void main(String[] args) {
		
		B b=new B();
	}

}


output=this is a
      this is b


package www.akash.home;

class A{
	
	public A() {
		
		System.out.println("this is a");
	}
public A(int n) {
		
		System.out.println("this is n in a");
	}
}
class B extends A{
	
	public B() {
		
		System.out.println("this is b");
	}
	
public B(int n) {
		
		System.out.println("this is n in b");
	}
	
}
public class ThisAndSuper {

	
	public static void main(String[] args) {
		
		B b=new B(5);
	}

}
output=
this is a
this is n in b



//super()=executes the constructor of super class ,all constructor as inbuilt super()
package www.akash.home;

class A{
	
	public A() {
		super();
		System.out.println("this is a");
	}
public A(int n) {
	 super();
		System.out.println("this is n in a");
	}
}
class B extends A{
	
	public B() {
		super();
		System.out.println("this is b");
	}
	
public B(int n) {
		super();
		System.out.println("this is n in b");
	}
	
}
public class ThisAndSuper {

	
	public static void main(String[] args) {
		
		B b=new B(5);
	}

}
//this()=use to execute the constructor in the same class
package www.akash.home;

class A{
	
	public A() {
		super();
		System.out.println("this is a");
	}
public A(int n) {
		super();
		System.out.println("this is n in a");
	}
}
class B extends A{
	
	public B() {
		super();
		System.out.println("this is b");
	}
	
public B(int n) {
		this();
		System.out.println("this is n in b");
	}
	
}
public class ThisAndSuper {

	
	public static void main(String[] args) {
		
		B b=new B(5);
	}

}
output=this is a
this is b
this is n in b

package www.akash.home;

class A{
	
	public A() {
		this();
		System.out.println("this is a");
	}
public A(int n) {
		super();
		System.out.println("this is n in a");
	}
}
class B extends A{
	
	public B() {
		super();
		System.out.println("this is b");
	}
	
public B(int n) {
		super(n);
		System.out.println("this is n in b");
	}
	
}
public class ThisAndSuper {

	
	public static void main(String[] args) {
		
		B b=new B(5);
	}
	

}
output=this is n in a
this is n in b
*/

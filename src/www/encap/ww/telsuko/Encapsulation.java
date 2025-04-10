/*
package www.encap.ww.telsuko;


class Human{
	
	int age;
	String name;
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.age=30;
		obj.name="akash";
		System.out.println(obj.age);
		System.out.println(obj.name);

	}

}  //it can be accessed by object but for encapsulation we should kkep variables as private where others cannot access those varibales





package www.encap.ww.telsuko;


class Human{
	
	private int age;
	private String name;
	
	public int getage() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj=new Human();

   obj.getage();
   System.out.println(obj.getage());
   
   obj.getName();
   System.out.println(obj.getName());
	}

}//But we are assigneing value directly but we need pass by the value



package www.encap.ww.telsuko;


class Human{
	
	private int age;
	private String name;
	
	public int getage() {
		return age;
	}
	
	public void setage(int a) {
		age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String b) {
		name=b;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj=new Human();

  obj.setage(10);
  obj.setName("akash");
  
  System.out.println(obj.getage());
  System.out.println(obj.getName());
	}

}

*/


package www.encap.ww.telsuko;


class Human{
	
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(1000);
		System.out.println(obj.getAge());
		
		
		obj.setName("sneha");
		System.out.println(obj.getName());

	}

}
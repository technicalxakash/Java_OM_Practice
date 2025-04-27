//package www.oops.com;
//class Human{
//	
//	private int age=20;
//	private String name="akash";
//	
//	public int getage() {
//		return age;
//	}
//	
//	public String getname() {
//		return name;
//	}
//}
//public class Encapsulation {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Human hu=new Human();
//
//			System.out.println(hu.getage());
//			System.out.println(hu.getname());
//			
//	}
//
//}



package www.oops.com;
class Human{
	
	private int age;
	private String name;
	
	public int getage() {
		return age;
	}
	public void setage(int a) {
		age=a;
	}
	public String getname() {
		return name;
	}
	public void setname(String a) {
		name=a;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Human hu=new Human();

			hu.setage(9);
			hu.setname("akash");
			System.out.println(hu.getage());
			System.out.println(hu.getname());
	}

}
package www.iinterface.com;

public class User {

	public static void main(String[] args) {

         Lenova le=new Lenova();
         System.out.println("For lenova");
         le.copy();
         le.paste();
         le.cut();
         le.security();
         Laptop.Printing();//directly we are calling using creating creating object
         
         System.out.println("==========================================");
         
         Hp hp=new Hp();
         System.out.println("For hp");
         hp.copy();
         hp.paste();
         hp.cut();
         hp.security();
         Laptop.Printing();  //for static using interface name we are calling 
         
         System.out.println("==========================================");
         
         Apple ap=new Apple();
         System.out.println("For apple");
         ap.copy();
         ap.paste();
         ap.cut();
         
         System.out.println("==========================================");
	}

}

package www.abstarctionn.com;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenova len=new Lenova();
		
		len.copy();
		len.paste();
		len.cut();
		len.keyboard();
		System.out.println("====================================================");
		hp h=new hp();
		h.copy();
		h.paste();
		h.cut();
		h.keyboard();
		System.out.println("====================================================");
		Apple ap=new Apple();
		ap.copy();
		ap.paste();
		ap.cut();
		ap.keyboard();
		ap.screenshot();
		System.out.println("====================================================");

	}

}

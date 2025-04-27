package www.oops.com;

class Guest{
	public void read() {
		System.out.println("read the code");
	}
}

class Developer extends Guest{
	
	public void write() {
		
		System.out.println("write the code");
	}
}

class Admin extends Developer{
	
	public void manages() {
		
		System.out.println("manages the code");
	}
}
public class Inheritancee {

	public static void main(String[] args) {
		System.out.println("========DONE BY GUEST========");
		Guest g=new Guest();
		g.read();
		System.out.println("========DONE BY DEVELOPER========");
		Developer d=new Developer();
		d.read();
		d.write();
		System.out.println("========DONE BY ADMIN========");
		Admin a=new Admin();
		a.read();
		a.write();
		a.manages();

	}

}

//========DONE BY GUEST========
//read the code
//========DONE BY DEVELOPER========
//read the code
//write the code
//========DONE BY ADMIN========
//read the code
//write the code
//manages the code

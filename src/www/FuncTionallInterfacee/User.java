package www.FuncTionallInterfacee;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Car c=new Car() {
            	public void drive() {
            		System.out.println("Drive is called");
            		
            	}
            };
            c.drive();
	}

}

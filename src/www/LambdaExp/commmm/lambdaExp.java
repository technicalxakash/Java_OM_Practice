package www.LambdaExp.commmm;


//@FunctionalInterface
//interface Calculator{
//	void add();
//}
//
//public class lambdaExp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Calculator lm=new Calculator() {
//			@Override
//			
//			public void add() {
//				System.out.println("hii");
//			}
//			
//		};
//		lm.add();
//		
//	}
//
//}








//@FunctionalInterface
//interface Car{
//	public void drive();
//}
//
////using traditional methods
//class Audi implements Car{
//	
//	@Override
//	public void drive() {
//		System.out.println("this is driver driving the audi");
//		
//	}
//}
//
//public class lambdaExp {
//
//	public static void main(String[] args) {
//		//using inner types
//		Car c=new Car() {
//			
//			public void drive() {
//				System.out.println("this is driver driving the bmw");
//			}
//		};
//		c.drive();
//		
//		Audi a=new Audi();
//		a.drive();
//	}
//
//}
//output=this is driver driving the bmw
//this is driver driving the audi


//using lambda expersion
//@FunctionalInterface
//interface Car{
//	public void drive();
//}
//
////using traditional methods
//class Audi implements Car{
//	
//	@Override
//	public void drive() {
//		System.out.println("this is driver driving the audi");
//		
//	}
//}
//
//public class lambdaExp {
//
//	public static void main(String[] args) {
//		//decreaing line of code lambda expersions
////		Car c=()-> System.out.println("this is driver driving the bmw");
////          c.drive();
//		
//		
////mutiple print statements
//		Car c=()-> {
//			int speed=100;
//			System.out.println("this is driver driving the bmw");
//		System.out.println("this is bmw");
//			if(50>speed) {
//				System.out.println("low speed");
//			}
//			else System.out.println("high speed");
//		};
//      c.drive();
//		
//		Audi a=new Audi();
//		a.drive();
//	}
//
//}















//with two parameters
@FunctionalInterface
interface Car{
	public void drive(int speed,int time);
}

//using traditional methods
class Audi implements Car{
	
	@Override
	public void drive(int speed,int time) {
		System.out.println("this is driver driving the audi : "+speed+"====="+time);
		
	}
}

public class lambdaExp {

	public static void main(String[] args) {
		//decreaing line of code lambda expersions
//		Car c=()-> System.out.println("this is driver driving the bmw");
//          c.drive();
		
		
//mutiple print statements
		Car c=(int speed,int time)-> {
			
			System.out.println("this is driver driving the bmw : "+speed+"====="+time);
		System.out.println("this is bmw");
			if(50>speed) {
				System.out.println("low speed : "+speed+"====="+time);
			}
			else System.out.println("high speed : "+speed+"====="+time);
		};
      c.drive(50,1000);
		
		Audi a=new Audi();
		a.drive(100,2000);
	}

}

/*
package www.MutiThreading.commmmm;



public class MultiThreadssss {

	public static void main(String[] args) {
		System.out.println("Hi what do you doing");
		System.out.println(Thread.currentThread().getName());  //main
		System.out.println(Thread.activeCount());//1
		System.out.println(Thread.currentThread().getId());//1
	System.out.println(Thread.currentThread().getPriority());//5
		
		Thread t1=new Thread();
		t1.start();
		//System.out.println(Thread.activeCount()); //2
		
		Thread t2=new Thread();
		t2.start();
		Thread t3=new Thread();
		t3.start();
		Thread t4=new Thread();
		t4.start();
		Thread t5=new Thread();
		t5.start();
		System.out.println(Thread.activeCount());
		
	}

}



package www.MutiThreading.commmmm;

class Employee extends Thread{
	
	public Employee(String Ename) {
		sy
	}
	
	
	@Override
public void run() {
	
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
class Manager extends Thread{
	
	@Override
public void run() {
	
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
public class MultiThreadssss {

	public static void main(String[] args) throws InterruptedException {
	

   
        
        
		Employee e1=new Employee();
		e1.start();
		
		
		
		Manager m1=new Manager();
		m1.start();
		
 

	     System.out.println("Active Threads: " + Thread.activeCount());
		
	}
	

}
//Multithredaing implmentation
	
class Employee extends Thread{
	
	public Employee(String tname) {
		super(tname);
	}
	@Override
public void run() {
	
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
class Manager extends Thread{
	
	
	public Manager(String tname) {
		super(tname);
	}
	@Override
public void run() {
	
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	

    
        
        
		Employee e1=new Employee("T1");
		e1.start();
		
		
		
		Manager m1=new Manager("T2");
		m1.start();
		
 

	    System.out.println("Active Threads: " + Thread.activeCount());
		
	}
	

}


output=helloT1<>21
hi helloT2<>22
Active Threads: 1



//Threads implementation using RUnnable interface
package www.MutiThreading.commmmm;

class Employee implements Runnable{
	
	
	
	
	@Override
public void run() {
	
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
class Manager implements Runnable{
	
	
	@Override
public void run() {
	
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
public class MultiThreadssss {

	public static void main(String[] args) throws InterruptedException {
	

   
        
        
		Employee e1=new Employee();
		Thread t1=new Thread(e1,"T1");
		t1.start();
		
		
		Manager m1=new Manager();
		Thread t2=new Thread(m1,"T2");
		t2.start();
		
 

	     System.out.println("Active Threads: " + Thread.activeCount());
	     
	     hi helloT2<>22
	     helloT1<>21
	     Active Threads: 1

		
	}}
	




//Anonymous classes
package www.MutiThreading.commmmm;

class Employee implements Runnable{
	
	
	
	
	@Override
public void run() {
	
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
class Manager implements Runnable{
	
	
	@Override
public void run() {
	
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
public class MultiThreadssss {

	public static void main(String[] args) throws InterruptedException {
	

   
		Runnable r1=new Runnable() {
			
			public void run() {
				
				System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
			}
		};
        
Runnable r2=new Runnable() {
			
			public void run() {
				
				System.out.println("hi" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
			}
		};
		
		
		Thread t1=new Thread(r1,"T1");
		Thread t2=new Thread(r2,"T2");
		
		t1.start();
		t2.start();
		
		
	}}





//using lambda functions
package www.MutiThreading.commmmm;

class Employee implements Runnable{
	
	
	
	
	@Override
public void run() {
	
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
class Manager implements Runnable{
	
	
	@Override
public void run() {
	
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	
public class MultiThreadssss {

	public static void main(String[] args) throws InterruptedException {
	

   
Runnable r1=() ->System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
			
		
				
				
			
        
Runnable r2=() -> System.out.println("hi" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
				
			
		
		Thread t1=new Thread(r1,"T1");
		Thread t2=new Thread(r2,"T2");
		
		t1.start();
		t2.start();
		
		
	}}

output=helloT1<>21
hiT2<>22

*/

package www.MutiThreading.commmmm;

class Employee extends Thread{
	


	
	@Override
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("hello" + Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
	}
	}
	}
	
class Manager extends Thread{
	
	@Override
public void run() {
		for(int i=0;i<=20;i++) {
		System.out.println("hi hello"+ Thread.currentThread().getName() +"<>"+Thread.currentThread().getId());
		}
	}
	}
	
public class MultiThreadssss {

	public static void main(String[] args) throws InterruptedException {
	

   
        
        
		Employee e1=new Employee();
		
		Manager m1=new Manager();
		
//		e1.start();
//		e1.join();
//		m1.start();
		e1.start();
		
		e1.sleep(10000);
		
		m1.start();
		
	}
	

}

package www.akash.home;

import javaa.oops.com.Dog;

class Dog {
	 private String name;
	 private String color;
	 private String breed;
	 private int cost;
		private int age;
	 
	 public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	 
}
public class EncapsulationsSetGet {

	public static void main(String[] args) {
	
		Dog d1=new Dog();
	    
	    //error as the private members cannot be accessed
	    d1.name="jimmy";
	    d1.color="brown";
	    d1.breed="golden ret";
	    d1.cost=3000;
	    d1.age=4;
	    
	}

}

package www.akash.home;
class Dogg{
    private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	public Dogg() {
		this("Jimmy");
		System.out.println("inside zero paramterized constructor");
	this.name="Tommy";
	this.color="red";
	this.breed="pug";
	this.age=2;
	this.cost=4000;
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.breed);
	System.out.println(this.age);
	System.out.println(this.cost);
		
	}
	
	public Dogg (String name){
		this("Jimmy","Brown");
		System.out.println("inside one paramterized constructor");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.cost);
		
	}
	public Dogg (String name,String color ){
		this("Jipey","white","GR");
		System.out.println("inside two paramterized constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.cost);
	
}
	public Dogg (String name,String color ,String breed ){
		this("chintu","purple","Shitzu",3);
		System.out.println("inside three paramterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.cost);

}
	public Dogg (String name,String color ,String breed,int age ){
		
		this("rocky","brown-black","german shephard",7,9000);
		System.out.println("inside four paramterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.cost);

}
	public Dogg (String name,String color ,String breed,int age ,int cost){
		
		System.out.println("inside five paramterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.cost);

}
}
public class ConstructorsDest {

	public static void main(String[] args) {
	
		Dogg  d=new Dogg();
		
	}

}

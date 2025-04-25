//package CollectionsFramework.www;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Cricketer{
//	String name;
//	String country;
//	int matches;
//	int runs;
//	int wickets;
//	public Cricketer(String name, String country, int matches, int runs, int wickets) {
//		this.name=name;
//		this.country= country;
//		this.runs=runs;
//		this.matches=matches;
//		this.wickets=wickets;
//	}
//	@Override
//	public String toString() {
//		return name+"--"+country+"--"+runs+"--"+matches+"--"+wickets;
//	}
//	public class SortingObjects{
//	
//	public static void main(String[] args) {
//			Cricketer c1 = new Cricketer("ABD","SA",8000,200,20);
//			Cricketer c2 = new Cricketer("VK","IND",17000,300,5);
//			Cricketer c3 = new Cricketer("KL","IND",7800,170,17);
//			System.out.println(c1);
//			System.out.println(c2);
//			System.out.println(c3);
//			System.out.println("-----------");
//			ArrayList<Cricketer> al = new ArrayList<Cricketer>();
//			al.add(c1);
//			al.add(c2);
//			al.add(c3);
//			
//			System.out.println(al);
//			Collections.sort(al); // gives error
//			System.out.println(al);
//		}
//	}
//}


















package CollectionsFramework.www;
import java.util.ArrayList;
import java.util.Collections;

class Cricketer{
	String name;
	String country;
	int matches;
	int runs;
	int wickets;
	public Cricketer(String name, String country, int matches, int runs, int wickets) {
		this.name=name;
		this.country= country;
		this.runs=runs;
		this.matches=matches;
		this.wickets=wickets;
	}
	@Override
	public String toString() {
		return name+"--"+country+"--"+runs+"--"+matches+"--"+wickets;
	}
	@Override
	public int com
	public class SortingObjects{
	
	public static void main(String[] args) {
			Cricketer c1 = new Cricketer("ABD","SA",8000,200,20);
			Cricketer c2 = new Cricketer("VK","IND",17000,300,5);
			Cricketer c3 = new Cricketer("KL","IND",7800,170,17);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println("-----------");
			ArrayList<Cricketer> al = new ArrayList<Cricketer>();
			al.add(c1);
			al.add(c2);
			al.add(c3);
			
			System.out.println(al);
			Collections.sort(al); // gives error
			System.out.println(al);
		}
	}
}
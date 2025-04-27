
//1)Enumeration=interface=introduced to iterating the legacy collection objects=java 1.0
//2)iterators=//iterators are the interfaces
//introduced to iterating the collections objects
//one-direction read only with special permission for removing 
package www.iterator.commm;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorss {

	public static void main(String[] args) {
		
ArrayList<Integer> a1=new ArrayList<>();
		a1.add(100);
		a1.add(50);
		a1.add(150);
		a1.add(25);
		a1.add(125);
		a1.add(75);
		a1.add(175);
		
	Iterator<Integer> i=a1.iterator();
	//i.hasNext();
	//i.nexr();
	/*
	while(i.hasNext()) {
		System.out.println(i.next());
		
		output=100
				50
				150
				25
				125
				75
				175
	
	}
	*/
	
	
//	while(i.hasNext()) {
//		i.next();
//		i.remove();
//		
//		
//	}
//	System.out.println(a1);
//	}
//	
	i.next();
	i.remove();
	System.out.println(a1);
	}
}

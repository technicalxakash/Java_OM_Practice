package CollectionsFramework.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkeddListt {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add("s1");
		al.add("s2");
		System.out.println(al);  //[s1, s2]
		
		LinkedList ll=new LinkedList();
		ll.add("y1");
		ll.add("y2");
		ll.add("y3");
		ll.add("y4");
		ll.add("y3");
		ll.add(null);
		
		System.out.println(ll);    //[y1, y2, y3, y4]
		  
		
		//ll.add(0, "y5");
		//System.out.println(ll);  //[y5, y1, y2, y3, y4]
		
		

        ll.addAll(al);
       System.out.println(ll);//[y1, y2, y3, y4, s1, s2]
        
       // ll.addAll(0, al);
        //System.out.println(ll);//[s1, s2, y1, y2, y3, y4, s1, s2]
        
        
       //ll.remove(1);
        //System.out.println(ll);//[s1, y1, y2, y3, y4, s1, s2]
        
        
        //ll.remove("s1");
        //System.out.println(ll);//[s2, y1, y2, y3, y4, s1, s2]
        
       // ll.clear();
        //System.out.println(ll);//[] //first node and last node as setted as null
        
        //ll.removeAll(al);
        //System.out.println(ll);//[y1, y2, y3, y4]
        
        
        //System.out.println(ll.get(2));//y3
        
        //System.out.println(ll.contains("raja"));//false
        
        //System.out.println(ll.contains("y1"));//true
        //System.out.println(ll.contains(al));//false
        
        
        //ll.set(2, "ss");
        //System.out.println(ll);//[y1, y2, ss, y4, s1, s2]
        
        System.out.println(ll);//[y1, y2, y3, y4, y3, null, s1, s2]
        
        
        //System.out.println(ll.removeFirst());//y1
        //System.out.println(ll.removeLast());//s2
        
        
        //System.out.println(ll.removeFirstOccurrence("y3"));//[y1, y2, y4, y3, null, s1, s2]
        //System.out.println(ll);
        //System.out.println(ll.removeLastOccurrence("y3"));//[y1, y2, y4, null, s1, s2]
        //System.out.println(ll);
        
        
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        
       // [y1, y2, y3, y4, y3, null, s1, s2]
        	//	[s2, s1, null, y3, y4, y3, y2, y1]
	}

}

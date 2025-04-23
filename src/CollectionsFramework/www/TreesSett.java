package CollectionsFramework.www;

import java.lang.Character.Subset;
import java.util.TreeSet;

public class TreesSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<Integer> ts=new TreeSet<>();
         ts.add(10);
         ts.add(2);
         ts.add(45);
         ts.add(67);
         ts.add(1);
         ts.add(3);
         ts.add(67);
         ts.add(8);
         System.out.println(ts);
         
//         System.out.println(ts.first());//1
//         System.out.println(ts.contains(67));//true
//         System.out.println(ts.isEmpty());//false
//         System.out.println(ts.pollFirst());
//         System.out.println(ts.pollLast());
         //System.out.println(ts.remove(2));
         //System.out.println(ts);//[1, 3, 8, 10, 45, 67]
         //System.out.println(ts.last());//67
         
         //System.out.println(ts.headSet(10));//[1, 2, 3, 8]
         
         
         //System.out.println(ts.descendingSet());//[67, 45, 10, 8, 3, 2, 1]
         
         //System.out.println(ts.tailSet(10));//[10, 45, 67]
         
       System.out.println( ts.subSet(2, 45));//[2, 3, 8, 10]
	}

}

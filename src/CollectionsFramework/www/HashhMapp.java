package CollectionsFramework.www;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashhMapp {

	public static void main(String[] args) {
            HashMap<Integer, String> hm = new HashMap<>();
            hm.put(1, "Sachin");
            hm.put(2, "Sehwag");
            hm.put(3, "Dravid");
            hm.put(4, "Kohli");
            hm.put(5, "Dhoni");

            
            System.out.println(hm);
            
            
            hm.put(6, "Kohli");
            System.out.println(hm);
            
            hm.put(4, "Dravid");
            System.out.println(hm);
            
            
            HashMap<Integer, String> hm2 = new HashMap<>();
           
            hm2.put(23, "ABC");
            hm2.put(12, "DEF");
            hm2.put(34, "GHI");
            hm2.put(54, "JKL");
            hm2.put(87, "MNO");
            System.out.println(hm2);
            
            HashMap<Integer, String> hm3 = (HashMap<Integer, String>) hm.clone();
            System.out.println(hm3);
 
            System.out.println(hm2);
            hm2.clear();
            System.out.println(hm2);
            
            System.out.println(hm.containsKey(2));
            System.out.println(hm.containsValue("Sehwag"));

            
            System.out.println(hm.containsKey(112));
            System.out.println(hm.containsValue("SSehwag"));
            
            System.out.println("=============");
            
           
            Set<Entry<Integer,String>> entrySet = hm.entrySet();
            for(Map.Entry<Integer, String> entry : entrySet) {
         	   System.out.println(entry.getValue());
            }
            System.out.println("------------");
            for(Map.Entry<Integer, String> entry : entrySet) {
         	   System.out.println(entry.getKey());
            }
            System.out.println("------------");
            for(Map.Entry<Integer, String> entry : entrySet) {
         	   System.out.println(entry.getKey()+"------"+entry.getValue());
            }
            
            boolean res = hm.equals(hm3);
            System.out.println(res);
            
            res= hm.equals(hm2);
            System.out.println(res);
            
            System.out.println(hm.get(2));
            System.out.println(hm.get(29));
            
            System.out.println(hm.getOrDefault(29, "Data with this key is not available"));
            
            Set<Integer> keySet = hm.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            while(iterator.hasNext()==true) {
         	   System.out.println(iterator.next());
            }
           
            Collection<String> cl = hm.values();
            Iterator<String> iterator2 = cl.iterator();
            while(iterator2.hasNext()==true) {
         	   System.out.println(iterator2.next());
            }
            
     	}

     }


//output={1=Sachin, 2=Sehwag, 3=Dravid, 4=Kohli, 5=Dhoni}
//{1=Sachin, 2=Sehwag, 3=Dravid, 4=Kohli, 5=Dhoni, 6=Kohli}
//{1=Sachin, 2=Sehwag, 3=Dravid, 4=Dravid, 5=Dhoni, 6=Kohli}
//{34=GHI, 54=JKL, 23=ABC, 87=MNO, 12=DEF}
//{1=Sachin, 2=Sehwag, 3=Dravid, 4=Dravid, 5=Dhoni, 6=Kohli}
//{34=GHI, 54=JKL, 23=ABC, 87=MNO, 12=DEF}
//{}
//true
//true
//false
//false
//=============
//Sachin
//Sehwag
//Dravid
//Dravid
//Dhoni
//Kohli
//------------
//1
//2
//3
//4
//5
//6
//------------
//1------Sachin
//2------Sehwag
//3------Dravid
//4------Dravid
//5------Dhoni
//6------Kohli
//true
//false
//Sehwag
//null
//Data with this key is not available
//1
//2
//3
//4
//5
//6
//Sachin
//Sehwag
//Dravid
//Dravid
//Dhoni
//Kohli
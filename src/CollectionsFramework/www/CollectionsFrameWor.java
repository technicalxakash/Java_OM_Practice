package CollectionsFramework.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsFrameWor {

	public static void main(String[] args) {
	        ArrayList<Integer> al1=new ArrayList<>();
	        al1.add(1);
			al1.add(2);
			al1.add(3);
			al1.add(4);
			al1.add(5);
			al1.add(6);
			
			System.out.println(al1);
			
			Collections.reverse(al1);
			System.out.println(al1);
			
			Collections.shuffle(al1);
			System.out.println(al1);
			
			
			        List<String> names = Arrays.asList("John", "Ale", "Christopher", "Bob");

			        
			        Collections.sort(names, new Comparator<String>() {
			            public int compare(String s1, String s2) {
			                return Integer.compare(s1.length(), s2.length());
			            }
			        });


			        
			        
			       Collections.sort(al1);
			      int index=  Collections.binarySearch(al1, 5);
			      System.out.println("Index of number is : " +index);
			        
			        
			        
			 
			    }
			}

			

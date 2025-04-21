package CollectionsFramework.www;
import java.util.ArrayList;
import java.util.Collections;
public class AarrayLiist {

	public static void main(String[] args) {
		
				ArrayList al1=new ArrayList();
				al1.add(1);
				al1.add(2);
				al1.add(3);
				al1.add(4);
				al1.add(5);
				al1.add(6);
				al1.add(0, 8);
				
				
				
				System.out.println(al1);
				
				ArrayList al11=new ArrayList();
				al11.add(11);
				al11.add(22);
				al11.add(32);
				al11.add(42);
				al11.add(53);
				al11.add(64);
				System.out.println(al11);
				/*
				al1.addAll(al11);
				System.out.println(al1);
//				[8, 1, 2, 3, 4, 5, 6]
//				[8, 1, 2, 3, 4, 5, 6, 11, 22, 32, 42, 53, 64]
				
				
				
				al1.addAll(0, al11);
				System.out.println(al1);  //[11, 22, 32, 42, 53, 64, 8, 1, 2, 3, 4, 5, 6, 11, 22, 32, 42, 53, 64]

				
				
				al1.clear();//this will empty the array
				System.out.println("the empty is "+al1);//the empty is []
				
				
				
			     al11.clone();
			        System.out.println("The duplicte of the array is "+al11);//The duplicte of the array is [11, 22, 32, 42, 53, 64]
			        
			        
			        
			        boolean res = al11.contains(11);
			        System.out.println(res);//true
			        
			       
			        
			        System.out.println(al1.get(0)); //gives the element at specified index
			        System.out.println( al1.getClass());  //gives the class path
			        System.out.println(al1.indexOf(6));  //gives the index of specified object
			        System.out.println(al1.lastIndexOf(6));
			        
			        
//			        [8, 1, 2, 3, 4, 5, 6]
//			        		8
//			        		class java.util.ArrayList
//			        		6
//			        		6

			        
			        
			        Integer integer = 8; //auto-boxing:- converting the data into object internally, integer refers to wrapper class(non-primitive)
			        al1.remove(integer);      //because int becomes primitive data type
			        System.out.println(al1); //[1, 2, 3, 4, 5, 6]
			        
			        al1.remove(0);     //removes the element at specified index
			        System.out.println(al1);//[2, 3, 4, 5, 6]
			        
			        
			       
			        
			      al1.set(0, 9);//it replaces the existing value with the new value without 
			      System.out.println(al1); //[9, 1, 2, 3, 4, 5, 6]
			      
			      
			      */
				
			      //includes the first index and excludes the last index
			      //System.out.println( al1.subList(2, 6));//[2, 3, 4, 5]
			      
			      
			      System.out.println(al1);  
			   Collections.reverse(al1);
			   System.out.println(al1);
			}

			

	}



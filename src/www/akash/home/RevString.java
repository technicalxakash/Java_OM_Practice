
package www.akash.home;
  
 public class RevString {
 
 public static void main(String[] args) 
 { 
	 String str="racecar"; char[]
 arr=str.toCharArray(); //The toCharArray() method in Java converts a string into a character array, 
 String rev=""; 
 for(int i=arr.length-1;i>=0;i--) {
rev=rev+arr[i];
} 
 System.out.println(rev);
 
 }
 
 }

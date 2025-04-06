
/*
package www.akash.home;

public class panagram {

	public static void main(String[] args) {
	 String str="the quick brown fox jumps over the lazy dog";
	 str=str.toLowerCase();
	boolean ispanagram=true;
     for(char ch='a';ch<='z';ch++) {
    	 if(!str.contains(String.valueOf(ch))){  //String.valueOf(ch) converts the character into a string
    		 ispanagram=false;
    		 break;
    		 
    	 }
    	 
     }
     if (ispanagram) System.out.println("It is a pangram.");
         
      else {
         System.out.println("It is not a pangram.");
     }

     
	}

}
*/

package www.akash.home;

public class panagram {

	public static void main(String[] args) {
	 String str="the quick brown fox jumps over the lazy dog";	 
	
	 for(char ch='a';ch<='z';ch++) {
		 if(!str.contains(String.valueOf(ch))) {
			 System.out.println("it is not panagram");
			 break;
		 }
		 
	 }
	 System.out.println("it is panagram");
	}}

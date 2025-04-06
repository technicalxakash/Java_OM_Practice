package www.akash.home;

import java.util.Scanner;

public class ForLoopPro {

	public static void main(String[] args) {
		/*
//printing 1 to 100 values		 
 Scanner sc= new Scanner(System.in);
	System.out.println("enter the starting number : ");
	int startingNumber=sc.nextInt();
	System.out.println("enter the Ending number : ");
	int EndingNumber=sc.nextInt();
	for(int i=startingNumber;i<=EndingNumber;i++) {

		System.out.println("the number from starting to Ending is : "+i);

	}



//priting even number between 200 to 500
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int startingNumber=sc.nextInt();
		System.out.println("enter the Ending number : ");
		int EndingNumber=sc.nextInt();
		for(int i=startingNumber;i<=EndingNumber;i+=2) {
          System.out.println("the even from starting to Ending is "+i);

		}


//print the numbers which are divisible by 7 for the range of 150 to 200
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int startingNumber=sc.nextInt();
		System.out.println("enter the Ending number : ");
		int EndingNumber=sc.nextInt();
		for(int i=startingNumber;i<=EndingNumber;i++) {
	         if(i%7==0) {
	        	 System.out.println(i+ "divisible by 7");
	         }

			}



//print the sum of the even number between 40 and 80
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int startingNumber=sc.nextInt();
		System.out.println("enter the Ending number : ");
		int EndingNumber=sc.nextInt();
		int sum=0;
		for(int i=startingNumber;i<=EndingNumber;i+=2) {
			sum=sum+i;


		}
System.out.println(sum);

//print the odd numbers between 200 to 25(reverse order)

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int startingNumber=sc.nextInt();
		System.out.println("enter the Ending number : ");
		int EndingNumber=sc.nextInt();
		for(int i=startingNumber;i>=EndingNumber;i--) {
         if(i%2!=0) {
        	 System.out.println("the odd numbers are "+i);
         }

		}

	//prime number or not
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int Number=sc.nextInt();
		int divident=0;
		if(Number!=1 && Number!=2) {
			for(int i=3;i<=Number;i++) {
				if(Number%i==0) {
					divident++;
				}
			}

		}
		if(divident>=2) {
			System.out.println("It is a not prime number: "+Number);
		}
		else {
			System.out.println("It is a  prime number "+Number);
		}

		//prime number or not including range

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the starting number : ");
		int startingNumber=sc.nextInt();
		System.out.println("enter the Ending number : ");
		int EndingNumber=sc.nextInt();

		int i=0;

		for(int Number=startingNumber;Number<=EndingNumber;Number++) {
			int divident=0;

			if(Number!=1 && Number!=2) {
				for( i=1;i<=Number;i++) {
					if(Number%i==0) {
						divident++;
						count++;
					}
				}
				if(divident<=2) {
					System.out.println("the prime from "+startingNumber+ "to "+EndingNumber+ "is "+ Number);


				}			

			}



		}



//it is a palindorme or not
		String str="racecar";
		str=str.toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("it is a palindrome ");
		}
		else {
			System.out.println("it is not a palindrome");
		}


//convert all lowerCase into Uppercase Letters
		String str="racecar";
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i]>='a' && array[i]<='z') {
				array[i]=(char) (array[i]-32);
			}

		}
		str =new String(array);
		System.out.println(str);

////convert all upperCase into LowerCase Letters
		String str="RACECAR";
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i]>='A' && array[i]<='Z') {
				array[i]=(char) (array[i]+32);
			}

		}
		str =new String(array);
		System.out.println(str);





		        String str = "RaCeCaR";  
		        char[] array = str.toCharArray();

		        for (int i = 0; i < array.length; i++) {
		            if (array[i] >= 'a' && array[i] <= 'z') {
		                array[i] = (char) (array[i] - 32);  // Convert lowercase to uppercase
		            } else if (array[i] >= 'A' && array[i] <= 'Z') {
		                array[i] = (char) (array[i] + 32);  // Convert uppercase to lowercase
		            }
		        }

		        str = new String(array);
		        System.out.println("Converted String: " + str);
		 

//convert all upperCase into LowerCase Letters


		        String str = "AEIOUaeiou"; 
		        String result = ""; 
		        String res="";

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if (ch >= 'a' && ch <= 'z') {  
		                ch = (char) (ch - 32);  
		            }

		            result += ch; 
		        
		        char chh = str.charAt(i);
		        if (chh >= 'A' && chh <= 'Z') {  
	                chh = (char) (chh + 32);  
	            }
		        res += chh;
		        }
		        System.out.println("Converted String of all upperCase: " + result);
		        System.out.println("Converted String of all lowerCase: " + res);
		        
		      
		
		
//write a java program to count the number of  character in a string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		System.out.println("input : "+str);
		System.out.println("output : "+str.length());
		
		
		output=Enter the string : 
			asdfgbnasdfghzxcvbnqwertyu
			input : asdfgbnasdfghzxcvbnqwertyu
			output : 26
			
			
			
		
//Write a java program to reverse each word of a given String	  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		
		String ouputString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			//if(i!=word.length()-1) ouputString+=reverseWord+" ";
			//else ouputString+=reverseWord;
			 ouputString+=reverseWord+" ";
		}
		System.out.println(ouputString.trim());
		
		 
//write a java program to count the number of words in a string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		
		int count=0;
		for(int i=0;i<words.length;i++) {
			count++;
		}
		System.out.println("the number of words in a given String is "+count);  //output =Enter the string : 
		hello good morining akash
		the number of words in a given String is 4
		
		 
		
//Write a java program to count the total number of occurences of a given character in a string
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		System.out.println("Enter the target character : ");
	    char word=sc.next().charAt(0);
	    int count=0;
	    
	    for(int i=0;i<str.length();i++) {
	    	
	    	if(word==str.charAt(i)) {
	    		count++;
	    	}
	    }
	    
	 System.out.println("the target character is "+word);
	    System.out.println("the number of words in a given String is "+count);
		
	
		
//Write a java program to reverse a string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		System.out.println(str+" the reversed string is  "+revStr);
		System.out.println(str.length());
		System.out.println(revStr.length());
		
		
		
		
//reversing each word in given string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		
		
		String revProduct="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				
				reverseWord=reverseWord+word.charAt(j);
			}
			revProduct+=reverseWord + " ";
		}
		System.out.println(revProduct);
		
		
//Write a java program to modify the string like change odd words to uppercase and reverse the even words		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String buck="";
		String[] words=str.split(" ");
		String outputString="";
		 String revProduct="";
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if(i%2==0) {
				revProduct+=word.toUpperCase();
				
			}

			else {
				String reverseWord="";
				for(int j=word.length()-1;j>=0;j--) {
					
					reverseWord=reverseWord+word.charAt(j);
				}
				revProduct+=reverseWord+" ";

			}
			if (i < words.length - 1) {
                revProduct += " ";
            }
	 
			}
		
		System.out.println(revProduct);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		String Alphabets="";
		String Numbers="";
		String Specialchar="";
		int alphacount=0;
		int numcount=0;
		int Specialcharcount=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)>='Z' || str.charAt(i)>='a' && str.charAt(i)>='z'){
				Alphabets=Alphabets+str.charAt(i);
				alphacount++;
			}
			else if (str.charAt(i)>='0' && str.charAt(i)>='9'){
				Numbers=Numbers+str.charAt(i);
				numcount++;
			}
			else {
				Specialchar=Specialchar+str.charAt(i);
				Specialcharcount++;
			}
			
			
			
		}
		System.out.println("Alphabets: " + Alphabets);
        System.out.println("SumOfalphabets : "+alphacount);
        System.out.println("===============================");
        System.out.println("Numbers: " + Numbers);
        System.out.println("sumOfnumbers : "+numcount);
        System.out.println("===============================");
        System.out.println("specialChars : "+Specialchar);
        System.out.println("sumOfspecialChars : " +Specialcharcount);
        System.out.println("===============================");
        
        
		
		
		
		
//Write a java program to find the count of uppercase letters ,lowerCAse letters ,digits and special characters in a given String
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		int uppercase=0;
		int lowercase=0;
		int digits=0;
		int specialCharacterCount=0;
		for(char i: arr) {
			
			if(Character.isUpperCase(i)) {
				uppercase++;
				
			}
			else if(Character.isLowerCase(i)) {
				
				lowercase++;
				
			}
			else if(Character.isDigit(i)) {
				
				digits++;
			}
			else {
				specialCharacterCount++;
			}
			
			}
		System.out.println("uppercase "+uppercase);
		System.out.println("lowercase "+lowercase);
		System.out.println("digits "+digits);
		System.out.println("specialCharacterCount "+specialCharacterCount);
		
		
		*/
//WAP to find the first repeted and non-repeated characters in the given string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		char firstRepeatedChar=' ';
		char firstNonRepeatedChar=' ';
		
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i)
			if(tempChar!=0)
		}
		
		}
		
	
}
	
	






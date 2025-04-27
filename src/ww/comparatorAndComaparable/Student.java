//package ww.comparatorAndComaparable;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class Student {
//	int rollno;
//	String name;
//	int marks;
//	
//	public Student(int rollno,String name,int marks) {
//		
//		this.rollno=rollno;
//		this.name=name;
//		this.marks=marks;
//	
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		
//		return rollno+" "+name+" "+marks;
//	}
//
//
//
//	public static void main(String[] args) {
//		Student s1=new Student(1, "akash", 100);
//		Student s2=new Student(3, "akash", 98);
//		Student s3=new Student(2, "akash", 88);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		ArrayList<Student> arr=new ArrayList<>();
//		arr.add(s1);
//		arr.add(s2);
//		arr.add(s3);
//		System.out.println(arr);
//		Collections.sort(arr);//=============Error
//		System.out.println(arr);
//		
//
//	}
//
//}

//comparable
////sorting by roll no
//package ww.comparatorAndComaparable;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class Student implements Comparable<Student>{
//	int rollno;
//	String name;
//	int marks;
//	
//	public Student(int rollno,String name,int marks) {
//		
//		this.rollno=rollno;
//		this.name=name;
//		this.marks=marks;
//	
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		
//		return rollno+" "+name+" "+marks;
//	}
//   
//	@Override
//	public int compareTo(Student x) {
//		if(this.rollno>x.rollno) return 1;
//		else return -1;
//	}
//
//
//	public static void main(String[] args) {
//		Student s1=new Student(1, "akash", 100);
//		Student s2=new Student(3, "soni", 98);
//		Student s3=new Student(2, "raju", 88);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		ArrayList<Student> arr=new ArrayList<>();
//		arr.add(s1);
//		arr.add(s2);
//		arr.add(s3);
//		System.out.println(arr);
//		Collections.sort(arr);
//		System.out.println(arr);
//		
//
//	}
//
//
//
//	
//
//}


//ascending marks
//package ww.comparatorAndComaparable;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class Student implements Comparable<Student>{
//	int rollno;
//	String name;
//	int marks;
//	
//	public Student(int rollno,String name,int marks) {
//		
//		this.rollno=rollno;
//		this.name=name;
//		this.marks=marks;
//	
//	}
//
//	@Override
//	public String toString() {
//		
//		return rollno+" "+name+" "+marks;
//	}
//   
//	@Override
//	public int compareTo(Student x) {
//		if(this.marks>x.marks) return 1;
//		else return -1;
//	}
//
//
//	public static void main(String[] args) {
//		Student s1=new Student(1, "akash", 91);
//		Student s2=new Student(3, "soni", 98);
//		Student s3=new Student(2, "raju", 88);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		ArrayList<Student> arr=new ArrayList<>();
//		arr.add(s1);
//		arr.add(s2);
//		arr.add(s3);
//		System.out.println(arr);
//		Collections.sort(arr);
//		System.out.println(arr);
//		
//
//	}
//
//
//}





//comparator
package ww.comparatorAndComaparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	int rollno;
	String name;
	int marks;
	
	public Student(int rollno,String name,int marks) {
		
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	
	}

	@Override
	public String toString() {
		
		return rollno+" "+name+" "+marks;
	}
   
static class Alpha implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		if(x.marks>y.marks) return 1;
		else return -1;
	}
	
	
}


	public static void main(String[] args) {
		Student s1=new Student(1, "akash", 91);
		Student s2=new Student(3, "soni", 98);
		Student s3=new Student(5, "rama", 81);
		Student s4=new Student(2, "raju", 88);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

		ArrayList<Student> arr=new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		Alpha a=new Alpha();
		System.out.println(arr);
		
		Collections.sort(arr,a);
		System.out.println(arr);
		

	}

	


}

//output=1 akash 91
//3 soni 98
//5 rama 81
//2 raju 88
//[1 akash 91, 3 soni 98, 5 rama 81, 2 raju 88]
//[5 rama 81, 2 raju 88, 1 akash 91, 3 soni 98]


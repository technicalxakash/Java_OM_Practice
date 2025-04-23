package CollectionsFramework.www;

import java.util.ArrayDeque;

public class ArrayyDequque {

	public static void main(String[] args) {


		
//adition=offer,offerFirst,offerLast,add,addFirst,addLast
		
		ArrayDeque ad=new ArrayDeque<>();
		ad.add(5);
		ad.add(2);
		ad.add(1);
		ad.add(4);
		ad.add(8);
		ad.add(4);
		
		System.out.println(ad);
		
		/*
		ad.offer(7);
		System.out.println(ad);//[5, 2, 1, 4, 8, 4, 7]//add last
		
		ad.offerFirst(10);
		System.out.println(ad);//[10, 5, 2, 1, 4, 8, 4, 7] add first
		
		ad.offerLast(56);
		System.out.println(ad);//[10, 5, 2, 1, 4, 8, 4, 7, 56] add last
		
		ad.add(2);
		ad.addFirst(3);
		ad.addLast(58);
		
		System.out.println(ad);//[3, 10, 5, 2, 1, 4, 8, 4, 7, 56, 2, 58]
		*/
		
		
		/*
		//retrivel -peek,peekFirst,peekLast
		
		
		System.out.println(ad.peek());//5
		System.out.println(ad.peekFirst());//5
		System.out.println(ad.peekLast());//4
		
		*/
		
		//removal=poll,pollFirst,pollLast
		
		
//		System.out.println(ad);
//		System.out.println(ad.poll());
//		System.out.println(ad);
//		System.out.println(ad.pollFirst());
//		System.out.println(ad);
//		System.out.println(ad.pollLast());
		
		
		//		[5, 2, 1, 4, 8, 4]
		//				5
		//				[2, 1, 4, 8, 4]
		//				2
		//				[1, 4, 8, 4]
		//				4
		
		
		

	}

}

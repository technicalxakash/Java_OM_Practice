package ww.comparatorAndComaparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortinggPractice {

	public static void main(String[] args) {
		Integer[] arr= {1,32,2,4,3,56,48};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		
//		int[][] arr2D = {{1,2}, {3,4}};
//		System.out.println(Arrays.deepToString(arr2D));
		
		List<Integer> l=new ArrayList<>(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		Collections.sort(l);
		System.out.println(l);//[1, 2, 3, 4, 32, 48, 56]
	}

}

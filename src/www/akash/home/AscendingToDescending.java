package www.akash.home;

import java.util.Arrays;

public class AscendingToDescending {

	public static void main(String[] args) {
		int arr[]=new int[]{12,2,3,34,5};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
										
				}
			}
			
			}
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	7	

	}

}

package CollectionsFramework.www;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSett {
	public static void main(String[] args) {
		HashSet<Integer> ad=new HashSet<>();
		ad.add(5);
		ad.add(2);
		ad.add(1);
		ad.add(4);
		ad.add(8);
		ad.add(4);
		
		System.out.println(ad);//[1, 2, 4, 5, 8] it does not allow duplicates
		
		System.out.println(Arrays.toString(ad.toArray()));
		
		
		LinkedHashSet<Integer> al11=new LinkedHashSet<>();
		al11.add(11);
		al11.add(2);
		al11.add(32);
		al11.add(72);
		al11.add(53);
		al11.add(4);
		System.out.println(al11);
	}
}

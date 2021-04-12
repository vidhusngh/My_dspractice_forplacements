//count unique interaction element in array1 and 2
import java.util.*;
public class hsintersection {
	public static int interaction(int[]arr1,int []arr2) {
		HashSet<Integer> hs=new HashSet<Integer>();
		int count=0;
		for(int i:arr1) {
			hs.add(i);
			}
		for(int j=0;j<arr2.length;j++) {
			if(hs.contains(arr2[j])) {
				count++;
				hs.remove(arr2[j]);
			}
		} 
		return count;
	}
public static void main(String []args) {
	int []arr= {1,2,3,3,3,3};
	int []arr1= {1,2,3,3,4,5,1,6,7,7,9,1,2};
	System.out.println(interaction(arr,arr1));
}
}

//subarray with given sum
import java.util.*;
public class Subarray_givensum {
	public static boolean givensum(int []arr,int sum){
		int prefixsum=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			prefixsum+=arr[i];
			if(prefixsum==sum)return true;
			if(hs.contains(prefixsum-sum))return true;
			hs.add(prefixsum);
		}
		return false;
	}
public static void main(String []arg) {
	int []arr= {1,8,3,5,6,8,9};
	int sum=20;
	System.out.print(givensum(arr,sum));
}
}

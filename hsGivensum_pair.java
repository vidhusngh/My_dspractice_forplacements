//pair with given sum
import java.util.*;
public class hsGivensum_pair {
	public static boolean givn_sum(int []arr,int sum) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hs.contains(sum-arr[i])) {return true;}
			else{hs.add(arr[i]);}
		}
		return false;
	}
public static void main(String[]arg) {
	int[] arr= {1,2,3,4,5,6,3,55,22,12,14,16};
	int sum=16;
	System.out.println(givn_sum(arr,sum));
}
}

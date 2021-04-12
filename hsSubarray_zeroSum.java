import java.util.*;
public class hsSubarray_zeroSum {
	public static boolean subZero(int[]arr) {
		HashSet<Integer> hs=new HashSet<Integer>();
		int presum=0;
		for(int i=0;i<arr.length;i++) {
			presum+=arr[i];
			if(hs.contains(presum))return true;
			if(presum==0)return true;
			hs.add(presum);
		}
		return false;
	} 
public static void main(String[]arg) {
	int []arr= {1,2,-4,3,-5};
	System.out.println(subZero(arr));
}

}

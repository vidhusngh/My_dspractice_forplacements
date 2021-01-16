import java.util.HashSet;

public class subarray_withzero_sum {
public static void main(String []arg) {
	int arr[]= {1,2,4,6,-13};
	HashSet<Integer> hs=new HashSet<Integer>();
	int prefix_sum=0;
	for(int i=0;i<arr.length;i++) {
		if(hs.contains(prefix_sum)) {
			System.out.print("true");
			break;
			}
		else {prefix_sum+=arr[i];
			hs.add(prefix_sum);
		}
		if(prefix_sum==0) 
		{System.out.print("true");
		break;
		}
	}
}
}

import java.util.*;
public class hs_union {
public static int un(int []arr1,int[]arr2) {
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<arr1.length;i++) {
		hs.add(arr1[i]);
	}
	for(int j=0;j<arr2.length;j++) {
		hs.add(arr2[j]);
	}
	return hs.size();
}	
public static void main(String[]arg) {
	int []arr1= {1,2,2,4,2,6,4,2,4};
	int []arr2= {4,7,3,2,6,7,9};
	System.out.print(un(arr1,arr2));
}
}

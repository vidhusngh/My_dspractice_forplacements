import java.util.*;
public class Intersection2array {
	public static void main(String args[]) {
		int count=0;
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,6,3,9,8};
	HashSet hs	= new HashSet();
	for(int i=0;i<arr1.length;i++) {
		hs.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++) {
		if(hs.contains(arr2[i])) {
			hs.remove(arr2[i]);
			count++;
		}
	}
	System.out.print(count);
	}

}

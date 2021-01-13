//Count the distinct number in an array
import java.util.*;

public class Count_distinct_element {
public static void main(String args[] ) {
	int arr[]= {1,3,5,5,1,6};
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i:arr) {
		hs.add(i);}
		System.out.println("Distinct elements are "+hs.size());
	
}
}

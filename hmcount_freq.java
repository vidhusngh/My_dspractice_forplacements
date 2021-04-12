import java.util.*;
public class hmcount_freq {
	public static void count_frequency(int[] arr) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int x:arr) {
			hm.put(x,hm.getOrDefault(x, 0)+1);
		}
		for(Map.Entry<Integer,Integer> m:hm.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
	}
public static void main(String []arg) {
	int []arr= {10,50,20,20,30,40,20,10,50,90,20,30};
	count_frequency(arr);
}
}

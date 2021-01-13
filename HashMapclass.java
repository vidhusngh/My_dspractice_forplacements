//HashMap is used to store key value pairs
//It implements map interface
// Method of HashMap are size(),getKey(),getValue(),containsKey(),containsValue(),remove()
import java.util.*;
public class HashMapclass{
public static void main(String[] arg) {
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	hm.put("abc",5);
	hm.put("mcs",77);
	hm.put("and",35);
	hm.put("nd",34);
	System.out.println(hm);
	System.out.println(hm.size());
    System.out.println(hm.containsKey("abc"));
    System.out.println(hm.containsValue(3));
    hm.remove("abc");
    System.out.println(hm);
}
}

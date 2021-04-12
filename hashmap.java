import java.util.HashMap;
import java.util.Map;

public class hashmap {
public static void main(String []arg) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("abc",10);
	hm.put("def",20);
	System.out.println(hm.get("def"));
	System.out.println(hm.size());
	for(Map.Entry<String, Integer> m:hm.entrySet()) {
		System.out.println(m.getKey()+m.getValue());
	}
	System.out.println(hm.containsKey("abc"));
	System.out.println(hm.containsValue(20));
	hm.remove("abc");
	hm.isEmpty();
}
}
 
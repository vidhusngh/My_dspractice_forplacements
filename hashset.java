import java.util.*;

//hashset is used to store a set of keys
//hashset methods- add(),remove(),contains(),isEmpty(),hasNext(),size(),clear()
//add(), remove(),contains(),size(),clear() all take O(1)
public class hashset {
public static void main(String [] args) {
	HashSet<String> hs= new HashSet<String>();//The type should be non primitive like Integer(not int)
	hs.add("vidhu");
	hs.add("abc");
	hs.add("llkd");
	hs.add("yrteb");
    for(String s:hs) {
	System.out.print(s+" ");}
    System.out.println();
	System.out.println(hs.contains("abc"));
	hs.remove("vidhu");
	
	 for(String s:hs) {
			System.out.print(s+" ");}
	 System.out.println(hs.isEmpty());
	 System.out.println(hs.size());
	 hs.clear();
	 System.out.print(hs.size());
}	
}

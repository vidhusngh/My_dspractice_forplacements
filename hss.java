import java.util.HashSet;
import java.util.Iterator;
//HashSet in java
public class hss {
public static void main(String []arg) {
	HashSet<Integer> hs=new HashSet<Integer>();
hs.add(10);
hs.add(15);
hs.add(25);
hs.add(30);
//add function adds the item and return true. if it is already present it returns false
System.out.println(hs);
hs.remove(15);
System.out.println(hs.contains(25));
Iterator<Integer> i=hs.iterator();
while(i.hasNext()) {
	System.out.print(i.next()+" ");
}
System.out.println();
//No guarantee of order in iterator. Any item can be printed at any time
System.out.println(hs.size());
for(int j:hs) {
	System.out.print(j + " ");
}
System.out.println();
System.out.println(hs.isEmpty());
hs.clear();

System.out.println(hs.isEmpty());
}


}

//find the leftmost repeating character eg-"abccb" here b is the leftmost repeating character
//naive sol-for every character run a loop and check if it is repeating O(n^2) 
//efficient-make count array and store their frequency at then again traverse and check first element with frequqncy>1  O(n)
//Best sol-make a boolean array of size 256 and itrate from end for every string index mark it true,
public class LEFTMOST_REPEATINGCHARACTER {
	public static void main(String arg[]) {
boolean[] visited= new boolean[256];
String s1="abccbad";
int res=-1;
for(int i=s1.length()-1;i>-1;i--) 
{
	if(visited[s1.charAt(i)]) 
	    {
		res=i;
		}
	else {
		visited[s1.charAt(i)]=true;
	     }
}
if(res==-1) {System.out.print("No element found");System.exit(0);}
System.out.println(res);
}
}
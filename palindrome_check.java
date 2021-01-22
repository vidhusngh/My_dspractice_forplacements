
public class palindrome_check {
 public static void main(String args[]) {
	 String str="abccbav";
	 int start=0,end=str.length()-1;
	 while(start<end) {
		 if(str.charAt(start)!=str.charAt(end)) {
			 System.out.print("Not a palindrome");
			 break;
		 }
		 start++;end--;
	 }
	 }
 }


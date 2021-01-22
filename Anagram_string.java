//Anagram is checking if two string are permutation of each other
//every character in first string and their frequency should be same a second string but their order can differ
//Naive sol-Sort both the strings(make 2 character array and use s1.toCharArray and then use Arrays.sort ont the array) then both string(character array) become equal then check if s1.equals(s2)

//Efficient sol-Make 2 count array then for every character the count should increase for array 1 and count should decrease for array 2 . Final count array should contain all 0 if both  strings are anagram
public class Anagram_string {
 public static void main(String args[]) {
	 String s1="listen",s2="sileant";
	 int count[]=new int[256];
	 for(int i=0;i<s1.length();i++) {
		 count[s1.charAt(i)]++;
	 }
	 for(int i=0;i<s2.length();i++) {
		 count[s2.charAt(i)]--;
	 }
	 for
	 (int i=0;i<256;i++) {
		 if(count[i]!=0) {
			 System.out.print("Not an anagram");
			 System.exit(0);
		 }
		 
	 }
	 System.out.print("It is a anagram");
 }
}

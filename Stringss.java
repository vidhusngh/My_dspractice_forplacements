// String are sequence of characters
/*
c++ has ascii and java uses utf-16* 
in ascii we only have english character and utf-16 
uses 16 bit to store character and their first 128 bit are same as ascii */

//Print frequency of characters(lowercase) in sorted order
public class Stringss {
public static void main(String arg[]) {
	String strn="geeksforgeeks";
	int count[]=new int[26];
	for(int i=0;i<strn.length();i++) {
		     count[strn.charAt(i)-'a']++;
	}
	for(int i=0;i<strn.length();i++) {
		if(count[i]>0) {
			System.out.println((char)(i+'a')+" "+count[i]);
		}
		
	}
}
}

//Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.
class Repeatation
{
    static char nonrepeatingCharacter(String s)
    {
        //Your code here
         int count[]=new int[256];
   for(int i=0;i<s.length();i++){
       count[s.charAt(i)]++;
   }
   for(int i=0;i<s.length();i++){
       if(count[s.charAt(i)]==1)
       {
           return s.charAt(i);
       }
   }
   return '$';
    }
}

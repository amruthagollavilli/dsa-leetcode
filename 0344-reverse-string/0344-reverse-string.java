class Solution {
    public void reverseString(char[] s) {
     char[] rev =new char[s.length];

     for(int i=0;i<s.length;i++){
       rev[i] =s[i];
     }
     for(int i=0;i<s.length;i++){
       s[i] =rev[s.length-i-1];
     }  
    }
}
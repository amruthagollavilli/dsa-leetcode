class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int length = 0;
        boolean hasOdd = false;
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int count:freq){
            if(count%2 == 0){
                length += count;
            }
            else{
                length += count - 1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            length++;
        }
        return length;
    }
}
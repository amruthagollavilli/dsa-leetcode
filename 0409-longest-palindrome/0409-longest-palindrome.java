class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i= 0;i<s.length();i++){
            char c= s.charAt(i);
            if(map.containsKey(s.charAt(i))){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int length = 0;
        boolean hasOdd = false;

        // Use the frequencies
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        // One odd frequency character can be the center
        if (hasOdd) {
            length++;
        }

        return length;

    }
}
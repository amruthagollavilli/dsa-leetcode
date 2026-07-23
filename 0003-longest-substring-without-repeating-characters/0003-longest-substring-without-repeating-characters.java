class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        
        for(int i =0;i< s.length();i++){
            HashSet<Character> set = new HashSet<>();
            int count = 0;
         for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                count++;
        }
        maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
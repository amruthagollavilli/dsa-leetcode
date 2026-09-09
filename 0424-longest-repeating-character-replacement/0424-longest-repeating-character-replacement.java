class Solution {
    public int characterReplacement(String s, int k) {
      int res = 0;
      int maxf = 0;
      int left = 0;
      HashMap<Character,Integer> map = new HashMap<>();
      for(int right= 0 ; right < s.length(); right++){
         char c = s.charAt(right);
         map.put(c,map.getOrDefault(c,0)+1);
         maxf = Math.max(maxf, map.get(c));
         while ((right - left + 1) - maxf > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);  
                left++;
            }
         res = Math.max(res,right - left + 1);
      }
      return res;
    }
}
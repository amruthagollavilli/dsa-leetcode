class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        String sorteds1 = new String(arr);
        int left = 0;
        for(int right = 0; right<s2.length(); right++){
            if (right - left + 1 == s1.length()) {
                char[] subsetarr = s2.substring(left, right + 1).toCharArray();
                Arrays.sort(subsetarr);
            String subset = new String(subsetarr);
            if(subset.equals(sorteds1)){
                return true;
            }
            left++;
           }
        }
        return false;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));
        }
        StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
         rev.append(s.charAt(i));
        }
         return str.toString().equals(rev.toString());
    }
}
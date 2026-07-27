class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> ps = new HashMap<>();
        HashMap<String,Character> sp = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String w = words[i];
            if(!ps.containsKey(p))
                 ps.put(p,w);
            if (ps.containsKey(p)) {
              if (!ps.get(p).equals(w)) {
                     return false;
                    }
                }
            if(!sp.containsKey(w))
                 sp.put(w,p);
            if (sp.containsKey(w)) {
              if (sp.get(w)!=p) {
                     return false;
                    }
                }
        }
    return true;
    }
}
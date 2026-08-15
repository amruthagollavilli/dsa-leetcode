class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> map = new HashMap<>();
     for(String word : strs){   
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
         List<String> list = new ArrayList<>();
        String key = new String(arr);
        if(map.containsKey(key)){
           map.get(key).add(word);
        }
        else{
            list.add(word);
            map.put(key,list);
        }
     }
    return new ArrayList<>(map.values());
    }
}
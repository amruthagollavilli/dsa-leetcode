class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> n = new HashMap<>();
        int i;
        int j;
        int e;
        int abs;
        for(int l=0;l<nums.length;l++){
            e = nums[l];
            if(n.containsKey(e)){
               i = n.get(e);
               j = l;
               if(Math.abs(i-j) <= k){
                return true;
               }
        }
        n.put(e, l);
    }
    return false;
}
}
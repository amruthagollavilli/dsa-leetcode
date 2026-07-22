class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int x = 0;
        for(int i = 1; i<nums.length;i++){
            if(set.contains(nums[i])){
                x = nums[i];
                break;
            }
            else{
            set.add(nums[i]);
            }
        }
        return x;
    }
}
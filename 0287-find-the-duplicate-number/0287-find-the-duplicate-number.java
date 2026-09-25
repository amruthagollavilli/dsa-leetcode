class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int x = 0;
        int i = 0;
        while(i <= nums.length){
            if(set.contains(nums[i])){
                x = nums[i];
                break;
            }
            set.add(nums[i]);
            i++;
        }
        return x;
    }
}
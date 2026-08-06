class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        dfs(0,nums);
        return ans;
        
    }
    void dfs(int index, int[] nums){

        ans.add(new ArrayList<>(curr));

        for(int i = index; i<nums.length ; i++){

             if(i>index &&  nums[i] == nums[i-1]){
                continue;
             }

             curr.add(nums[i]);
             dfs(i+1,nums);
             curr.remove(curr.size() -1);
        }
    }
}
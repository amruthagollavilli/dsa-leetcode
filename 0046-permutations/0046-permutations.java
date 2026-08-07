class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
      visited = new boolean[nums.length];
      Arrays.sort(nums);
      dfs(nums); 
      return ans;
    }
    void dfs(int[] nums){

        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0 ;i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            curr.add(nums[i]);
            visited[i] = true;
            dfs(nums);
            curr.remove(curr.size() - 1);
            visited[i] = false;
         }
    }
}

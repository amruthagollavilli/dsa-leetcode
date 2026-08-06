class Solution {

    List<List<Integer>> ans =  new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);
          dfs(0,candidates,target);
          return ans;
    } 

    void dfs( int index, int[] candidates , int target){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
             return;
            }
            if(target < 0){
                 return;
                 }
        for(int i = index ; i < candidates.length ; i++ ){
            if(i > index && candidates[i] == candidates[i-1]){
                      continue;
                      }
             curr.add(candidates[i]);
             dfs(i+1,candidates,target - candidates[i]);
             curr.remove(curr.size() - 1);
        }
    }
}
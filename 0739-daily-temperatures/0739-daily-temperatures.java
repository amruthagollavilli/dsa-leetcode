class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> idxstack = new Stack<>();
       int[] ans = new int[temperatures.length];
       for(int i = 0;i<temperatures.length;i++){
        while(!idxstack.isEmpty()&& temperatures[i] > temperatures[idxstack.peek()]){
            int idx = idxstack.pop();
            ans[idx] = i - idx;
        }
        idxstack.push(i);
       }
       return ans;
    }
}
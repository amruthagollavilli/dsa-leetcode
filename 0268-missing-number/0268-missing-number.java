class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int exSum = (n*(n+1))/2;
        int aSum = 0;
        for (int i = 0; i < n; i++) {
            aSum += nums[i];
        }
         int miss = exSum - aSum;
         return miss;
    }
}
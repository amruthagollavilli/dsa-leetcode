class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
      int index = -1;
      for(int  i= nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            index = i;
            break;
        }
      }
      if(index == -1){
        reverse(nums,0,nums.length-1);
        return;
      }
      for(int j = nums.length-1;j > index;j--){
        if(nums[j] > nums[index]){
            int temp = nums[j];
            nums[j] =nums[index];
            nums[index] = temp;
            break;
        }
      }
     reverse(nums, index + 1,nums.length-1);
    }
}

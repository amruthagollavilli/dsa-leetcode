class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int min = 0;
        int area = 0;
        while(left < right){
            if(height[left]<height[right]){
                min = (right - left)*height[left];
                left++;
            }
            else if(height[right] < height[left]){
                min = (right - left)*height[right];
                right --;
            }
            else{
                min = (right - left)*height[right]; 
                left++;
                right--;
            }
            if(min > area){
                area = min;
            }
        }
        return area;
        }
}
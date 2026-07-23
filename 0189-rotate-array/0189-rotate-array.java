class Solution {
    public void rotate(int[] arr,int k ) {
        // code here
        int n = arr.length;
        k%=n;
       int[] temp = new int[k];
       for(int i=0;i<k;i++){
        temp[i] = arr[n-k+i];
       }
       for(int j=n-k-1;j>=0;j--){
        arr[j+k] = arr[j];
       }
       for(int h =0;h<k;h++){
        arr[h] = temp[h];
       }
        }    
}
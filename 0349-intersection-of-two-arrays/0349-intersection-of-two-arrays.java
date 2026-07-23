import java.util.*;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> set = new HashSet<>();
     Set<Integer> result=new HashSet<>();
     for(int n1:nums1){
        set.add(n1);
     }
     for(int n2:nums2){
        if(set.contains(n2)){
            result.add(n2);
        }
     }
     int[] arr= new int[result.size()];
    int i=0;
    for(int n:result)
        arr[i++]=n;
        return arr;
     }
}  
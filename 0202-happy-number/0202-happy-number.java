import java.util.*;
class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> set = new HashSet<>();
      while(n!=0&&!set.contains(n)){
       set.add(n);
       int sum = 0;
            int temp = n;

            // Step 1: extract digits and square
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp = temp / 10;
            }

            // Step 2: update n
            n = sum;
        }

        return n == 1;
    }
}
     
// Time Complexity: O(n)

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {
    public int[] sliding_Window_Maximum(int[] nums, int k){
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int l = 0, r = 0;
        Deque<Integer> q = new LinkedList<>();
        while(r < n){
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]) q.removeLast();
            q.addLast(r);
            if(l > q.getFirst()) q.removeFirst();
            if((r + 1) >= k){
                res[l] = nums[q.getFirst()];
                l++;
            }r++;
        } return res;
    }
    public static void main(String[] args) {
        slidingWindowMaximum a = new slidingWindowMaximum();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(a.sliding_Window_Maximum(nums, 3)));;
    }
}

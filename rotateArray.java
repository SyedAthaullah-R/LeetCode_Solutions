// Time Complexity: O(n)

import java.util.Arrays;

public class rotateArray {
    public void rotate_Array(int[] nums, int k){
        int n = nums.length;
        int[] res = new int[n];
        k %= n;
        for(int i = 0; i < n; i++){
            res[(i + k) % n] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, n);
    System.out.println(Arrays.toString(nums));
    
    }
    public static void main(String[] args) {
        rotateArray a = new rotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        a.rotate_Array(nums, 3);
        
    } 
}

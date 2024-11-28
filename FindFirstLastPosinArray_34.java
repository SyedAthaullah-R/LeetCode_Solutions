// The Time Complexity:
// Best Case: O(1)
// Average and Worst Case: O(n) use Binary Search to get O(log n)
import java.util.Arrays;
public class FindFirstLastPosinArray_34 {
    public int[] findRange(int[] nums, int target){
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 <= p2) {
            if(nums[p1] == target && nums[p2] == target) return new int[]{p1, p2};
            else if(nums[p1] < target) p1++;
            else p2--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        FindFirstLastPosinArray_34 a = new FindFirstLastPosinArray_34();
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(a.findRange(nums, 8)));
    }
}

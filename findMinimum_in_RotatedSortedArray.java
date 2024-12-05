// The Time Complexity:
// Best Case: O(1)
// Average naad Worst Case: O(log n)
public class findMinimum_in_RotatedSortedArray {
    public int find_min_rotated_array(int[] nums){
        int res = nums[0];
        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                break;
            }
            int mid = l + (r - l) / 2;
            res = Math.min(nums[mid], res);
            if(nums[mid] >= nums[l]) l = mid + 1;
            else r = mid - 1;
        }return res;
    }
    public static void main(String[] args) {
        findMinimum_in_RotatedSortedArray a = new findMinimum_in_RotatedSortedArray();
        int[] nums = {3,4,5,1,2};
        System.out.println(a.find_min_rotated_array(nums));
    }
}

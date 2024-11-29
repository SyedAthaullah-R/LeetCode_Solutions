// The TIme Complexity:
// Best Case: O(1)
// Average and Worst Case: (O log n)
public class serachInRotatedSortedArray {
    public int search_in_Rotated(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) return mid;
            
            else if(nums[l] <= nums[mid]){
                if(nums[mid] > target && nums[l] <= target) r =  mid - 1;
                else l = mid + 1;
            }
            
            else{
                if(nums[mid] < target && nums[r] >= target) l = mid + 1;
                else r = mid - 1;
            }
        }return - 1;
    }
    public static void main(String[] args) {
        serachInRotatedSortedArray a = new serachInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(a.search_in_Rotated(nums, 1));
    }
}

// Time Complexity:
// Best Case: O(1)
// Average and Worst Case: O(log n)

public class binarySearch {
    public int binary_Search(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }return - 1;
    }public static void main(String[] args) {
        binarySearch a = new binarySearch();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(a.binary_Search(nums, 9));
    }
}

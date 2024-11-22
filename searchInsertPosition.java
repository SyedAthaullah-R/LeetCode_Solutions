// Note the Time Complexity for this function is O(n)
// Use the Binary Search method to get O(log n)
public class searchInsertPosition {
    public int ins_pos(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]) return i;
        }
        return nums.length;
    }
    public static void main(String[] args) {
        searchInsertPosition a = new searchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println(a.ins_pos(nums, 2));
    }
}

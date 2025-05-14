// Time Complexity: O(n)
public class findTheDuplicateNumber {
    public int find_the_Duplicate_Number(int[] nums){
        int slow = 0, fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[fast];
            if(slow == fast) return slow;
        }
    }
    public static void main(String[] args) {
        findTheDuplicateNumber a = new findTheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(a.find_the_Duplicate_Number(nums));
    }
}

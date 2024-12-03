// The TIme Complexity:
// Best, Average and Worst Case: O(n)
public class RemoveDuplicatesFromSortedArray_ll {
    public int removeDuplicates(int[] nums){
        int j = 1, count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) count++;
            else count = 1;
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }return j;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_ll a = new RemoveDuplicatesFromSortedArray_ll();
        int[] nums = {1,1,1,2,2,2,3,3};
        System.out.println(a.removeDuplicates(nums));
    }
}

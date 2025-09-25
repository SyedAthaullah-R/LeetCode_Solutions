// Time Complexity: O(n)
import java.util.Arrays;

public class moveZeroes {
    public void Move_Zeroes(int[] nums){
        int l = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
    }
    public static void main(String[] args){
        moveZeroes a = new moveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        a.Move_Zeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

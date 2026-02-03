// Time Complexity: O(n)
public class trionicArray_i {
    public boolean isTrionic(int[] nums) {
        int i = 0, n = nums.length;
        while (i + 1 < n && nums[i] < nums[i + 1])
            i++;
        if (i == 0 || i == n - 1)
            return false;
        while (i + 1 < n && nums[i] > nums[i + 1])
            i++;
        if (i == n - 1)
            return false;
        while (i + 1 < n && nums[i] < nums[i + 1])
            i++;
        if (i == n - 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        trionicArray_i a = new trionicArray_i();
        int[] nums = { 1, 3, 5, 4, 2, 6 };
        System.out.println(a.isTrionic(nums));
    }
}

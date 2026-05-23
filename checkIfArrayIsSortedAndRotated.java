// Time Complexity: O(n)
public class checkIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length])
                count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        checkIfArrayIsSortedAndRotated a = new checkIfArrayIsSortedAndRotated();
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(a.check(nums));
    }
}

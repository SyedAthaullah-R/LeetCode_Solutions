public class findUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            sb.append(c == '1' ? '0' : '1');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        findUniqueBinaryString a = new findUniqueBinaryString();
        String[] nums = { "01", "10" };
        System.out.println(a.findDifferentBinaryString(nums));
    }
}

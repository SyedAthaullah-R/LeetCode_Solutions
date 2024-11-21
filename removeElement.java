public class removeElement {
    public int remove_element(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        removeElement a = new removeElement();
        int[] nums = {3,2,2,3};
        System.out.println(a.remove_element(nums, 3));
    }
}

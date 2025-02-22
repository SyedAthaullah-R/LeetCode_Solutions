// Time Complexity: O(n)
public class jumpGame {
    public boolean jump_Game(int[] nums){
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(maxIndex >= nums.length - 1) return true;
        } return false;
    }
    public static void main(String[] args) {
        jumpGame a = new jumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(a.jump_Game(nums));
    }
}

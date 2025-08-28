// Time Complexity: O(log n)
public class uglyNumber {
    public boolean isUgly(int n){
        if(n < 1) return false;
        int[] nums = {2, 3, 5};
        for(int i : nums){
            while(n % i == 0){
                n /= i;
            }
        } return n == 1;
    }
    public static void main(String[] args){
        uglyNumber a = new uglyNumber();
        System.out.println(a.isUgly(6));
    }
}

// Time Complexity: O(log n)
import java.util.HashSet;

public class happyNumber {
    public int sumOfSquareOfDigit(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        } return sum;
    }
    public boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        int res = sumOfSquareOfDigit(n);
        while(res > 1){
            res = sumOfSquareOfDigit(res);
            if(set.contains(res)) return false;
            set.add(res);
        } return res == 1;
    }
    public static void main(String[] args){
        happyNumber a = new happyNumber();
        System.out.println(a.isHappy(19));
    }
}

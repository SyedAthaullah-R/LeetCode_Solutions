// Time Complexity: O(log n)
public class powerOfThree {
    public boolean isPowerOfThree(int n){
        if(n == 0) return false;
        if(n == 1) return true;
        return isPowerOfThree(n % 3 == 0 ? n /= 3 : 0);
    }
    public static void main(String[] args){
        powerOfThree a = new powerOfThree();
        System.out.println(a.isPowerOfThree(27));
    }
}

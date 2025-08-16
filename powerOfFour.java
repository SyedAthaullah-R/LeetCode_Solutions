// Time Complexity: O(log n)
public class powerOfFour {
    public boolean isPowerOfFour(int n){
        if(n == 0) return false;
        if(n == 1) return true;
        return isPowerOfFour(n % 4 == 0 ? n /= 4 : 0);
    }
    public static void main(String[] args){
        powerOfFour a = new powerOfFour();
        System.out.println(a.isPowerOfFour(16));
    }
}

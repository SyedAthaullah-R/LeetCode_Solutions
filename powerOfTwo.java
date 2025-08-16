// Time Complexity: O(1)
public class powerOfTwo {
    public boolean isPowerOfTwo(int n){
        return n > 0 && 1073741824 % n == 0;
    }
    public static void main(String[] args){
        powerOfTwo a = new powerOfTwo();
        System.out.println(a.isPowerOfTwo(16));
    }
}

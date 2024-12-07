// Time Complexity: O(n)

import java.util.Arrays;
public class reverseString {
    public void reverse_String(char[] s){
        int l = 0, r = s.length - 1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        reverseString a = new reverseString();
        char[] s = {'h','e','l','l','o'};
        a.reverse_String(s);
        System.out.println(Arrays.toString(s));
    }
}

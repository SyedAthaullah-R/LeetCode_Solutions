
// Time Complexity: O(n)
import java.util.Arrays;

public class checkIfStringsCanBeEqualWithOperations_i {
    public boolean caBeEqual(String s1, String s2) {
        int[] evenI = new int[26], evenII = new int[26], oddI = new int[26], oddII = new int[26];
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                evenI[s1.charAt(i) - 'a']++;
                evenII[s2.charAt(i) - 'a']++;
            } else {
                oddI[s1.charAt(i) - 'a']++;
                oddII[s2.charAt(i) - 'a']++;
            }
        }
        return Arrays.equals(evenI, evenII) && Arrays.equals(oddI, oddII);
    }

    public static void main(String[] args) {
        checkIfStringsCanBeEqualWithOperations_i a = new checkIfStringsCanBeEqualWithOperations_i();
        System.out.println(a.caBeEqual("abcd", "cdab"));
    }
}

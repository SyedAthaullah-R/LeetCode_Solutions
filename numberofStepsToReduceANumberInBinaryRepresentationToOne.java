// Time Complexity: O(n) 
public class numberofStepsToReduceANumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        int res = 0, carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = (s.charAt(i) - '0') + carry;
            if (bit == 1) {
                res += 2;
                carry = 1;
            } else
                res++;
        }
        if (carry == 1)
            res++;
        return res;
    }

    public static void main(String[] args) {
        numberofStepsToReduceANumberInBinaryRepresentationToOne a = new numberofStepsToReduceANumberInBinaryRepresentationToOne();
        System.out.println(a.numSteps("1101"));
    }
}

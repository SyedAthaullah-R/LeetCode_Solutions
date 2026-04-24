// Time Complexity: O(n)
public class furthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int leftCount = 0, rightCount = 0, res = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L')
                leftCount++;
            else if (c == 'R')
                rightCount++;
        }
        if (leftCount >= rightCount) {
            for (char c : moves.toCharArray()) {
                if (c == 'L' || c == '_')
                    res--;
                else
                    res++;
            }
        } else if (rightCount > leftCount) {
            for (char c : moves.toCharArray()) {
                if (c == 'L')
                    res--;
                else if (c == 'R' || c == '_')
                    res++;
            }
        } else
            return moves.length();
        return Math.abs(res);
    }

    public static void main(String[] args) {
        furthestPointFromOrigin a = new furthestPointFromOrigin();
        System.out.println(a.furthestDistanceFromOrigin("L_RL__R"));
    }
}

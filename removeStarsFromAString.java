// Time Complexity: O(n)
public class removeStarsFromAString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*')
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        removeStarsFromAString a = new removeStarsFromAString();
        System.out.println(a.removeStars("leet**cod*e"));
    }
}

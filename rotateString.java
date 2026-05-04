// Time Complexity: O(n²)
public class rotateString {
    public boolean rotate_String(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String res = s.concat(s);
        return res.indexOf(goal) != -1 ? true : false;
    }

    public static void main(String[] args) {
        rotateString a = new rotateString();
        System.out.println(a.rotate_String("abcde", "cdeab"));
    }
}

//  Time Complexity: O(n)
public class reverseWordsinString {
    public String reverse_Words_In_String(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--)
            sb.append(words[i]).append(" ");
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        reverseWordsinString a = new reverseWordsinString();
        System.out.println(a.reverse_Words_In_String("the sky is blue"));
        
    }
}

// Time Complexity: O(n)
public class findTheKthCharacterInStringGame_I {
    public char kthCharacter(int k){
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int len = sb.length();
            for(int i = 0; i < len; i++){
                char c = sb.charAt(i);
                sb.append((char)((c - 'a' + 1) % 26 + 'a'));
            }
        } return sb.toString().charAt(k - 1);
    }
    public static void main(String[] args) {
        findTheKthCharacterInStringGame_I a = new findTheKthCharacterInStringGame_I();
        System.out.println(a.kthCharacter(5));
    }
}

// Time Complexity: O(n)
public class clearDigits {
    public String clear_Digits(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            if(Character.isDigit(sb.charAt(i))){
                if(i > 0){
                    sb.deleteCharAt(i - 1);
                    i--;
                }
                sb.deleteCharAt(i);
                i--;
            }
        } return sb.toString();
    }
    public static void main(String[] args) {
        clearDigits a = new clearDigits();
        System.out.println(a.clear_Digits("cb34"));
    }
}
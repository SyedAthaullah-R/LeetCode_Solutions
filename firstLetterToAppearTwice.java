// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class firstLetterToAppearTwice {
    public char repeated_Character(String s){
        List<Character> res = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(res.contains(c)) return c;
            res.add(c);
        } return ' ';
    }
    public static void main(String[] args) {
        firstLetterToAppearTwice a = new firstLetterToAppearTwice();
        System.out.println(a.repeated_Character("abccbaacz"));
    }
}

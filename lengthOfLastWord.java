//  Time Complexity: O(n)
public class lengthOfLastWord {
    public int Length_of_Last_Word(String s){
        int i = s.length() - 1, res = 0;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            res++;
            i--;
        } return res;
    }
    public static void main(String[] args) {
        lengthOfLastWord a = new lengthOfLastWord();
        System.out.println(a.Length_of_Last_Word("Hello World"));
    }
}

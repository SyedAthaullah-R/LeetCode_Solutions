//  Time Complexity: O(n)
public class integerToRoman {
    public String Integer_To_Roman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                sb.append(symbols[i]);
            }
        } return sb.toString();
    }
    public static void main(String[] args) {
        integerToRoman a = new integerToRoman();
        System.out.println(a.Integer_To_Roman(3749));
        
    }
}

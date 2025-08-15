// Time Complexity: O(n)
public class largestThreeSameDigitNumberInString {
    public String Largest_Good_Integer(String num){
        String[] numbers = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for(String i : numbers)
            if(num.contains(i)) return i;
        return "";
    }
    public static void main(String[] args) {
        largestThreeSameDigitNumberInString a = new largestThreeSameDigitNumberInString();
        System.out.println(a.Largest_Good_Integer("6777133339"));
    }
}

// Time Complexity: O(1)
public class countOddNumbersInanIntervalRange {
    public int countOdds(int low, int high){
        return (low % 2 == 0 && high % 2 == 0) ? (high - low) / 2 : ((high - low) / 2) + 1;
    }
    public static void main(String[] args){
        countOddNumbersInanIntervalRange a = new countOddNumbersInanIntervalRange();
        System.out.println(a.countOdds(3, 7));

    }
}

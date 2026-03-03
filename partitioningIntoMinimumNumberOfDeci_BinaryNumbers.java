// Time Complexity: O(n)
public class partitioningIntoMinimumNumberOfDeci_BinaryNumbers {
    public int minPartitions(String n) {
        int max = 0;
        for (char c : n.toCharArray())
            max = Math.max(max, c - '0');
        return max;
    }

    public static void main(String[] args) {
        partitioningIntoMinimumNumberOfDeci_BinaryNumbers a = new partitioningIntoMinimumNumberOfDeci_BinaryNumbers();
        System.out.println(a.minPartitions("32"));
    }
}

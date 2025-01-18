// Time Complexity: O(n)
import java.util.Stack;

public class largestRectangleInHistogram {
    public int largest_Rectangle_in_Histogram(int[] heights){
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] leftMost = new int[n], rightMost = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            leftMost[i] = st.isEmpty() ? - 1 : st.peek();
            st.push(i);
        }st.clear();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            rightMost[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, heights[i] * (rightMost[i] - leftMost[i] - 1));
        }return maxArea;
    }
    public static void main(String[] args) {
        largestRectangleInHistogram a = new largestRectangleInHistogram();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(a.largest_Rectangle_in_Histogram(heights));
    }
}

// Time Complexity: O(n)
public class findTheIndexOfTheFirstOccurrenceinaString {
    public int find_Index_of_String(String haystack, String needle){
    if(haystack.indexOf(needle) != - 1) return haystack.indexOf(needle);
        return - 1;
    }
    public static void main(String[] args) {
        findTheIndexOfTheFirstOccurrenceinaString a = new findTheIndexOfTheFirstOccurrenceinaString();
        System.out.println(a.find_Index_of_String("sadbutsad", "sad"));
        
    }

}

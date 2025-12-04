// Time Complexity: O(n)
public class countCollisionsOnARoad {
    public int countCollisions(String directions){
        int l = 0, r = directions.length() - 1, res = 0;
        while(l < directions.length() && directions.charAt(l) == 'L') l++;
        while(r >= 0 && directions.charAt(r) == 'R') r--;
        for(int i = l; i <= r; i++)
            if(directions.charAt(i) != 'S') res++;
        return res;
    }
    public static void main(String[] args){
        countCollisionsOnARoad a = new countCollisionsOnARoad();
        System.out.println(a.countCollisions("RLRSLL"));
    }
}

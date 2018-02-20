import java.util.Arrays;

public class Stairs {

    private static int[] memo;

    public static void main (String[] args){

        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n){

        memo = new int[n+1];
        Arrays.fill(memo, 0);
        return countNumberOfWays(n);
    }

    public static int countNumberOfWays(int n)
    {
        if(n <= 1)
            return 1;

        if (n == 2)
            return 2;

        if(memo[n] > 0)
        {
            return memo[n];

        }

        memo[n] = countNumberOfWays(n-1) + countNumberOfWays(n-2);
        return memo[n];

    }
}

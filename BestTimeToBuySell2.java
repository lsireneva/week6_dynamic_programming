import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuySell2 {

    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(final List<Integer> A) {
        int profit = 0;
        for(int i=1; i < A.size(); i++){
            int diff = A.get(i)-A.get(i-1);
            if(diff > 0){
                profit += diff;
            }
        }
        return profit;
    }

}

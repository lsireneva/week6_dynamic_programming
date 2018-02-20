import java.util.ArrayList;
import java.util.List;

public class BestTimeBuySell {

    public static int maxProfit(final List<Integer> A) {
        if(A==null||A.size()<=1)
            return 0;

        int min=A.get(0); // min so far
        int result=0;

        for(int i=1; i< A.size(); i++){
            result = Math.max(result, A.get(i)-min);
            min = Math.min(min, A.get(i));
        }

        return result;
    }

    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        System.out.println(maxProfit(a));
    }
}

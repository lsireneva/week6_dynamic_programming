import java.util.ArrayList;

public class MaxSumNoAdjacent {

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        arr.add(new ArrayList<Integer>(temp));
        temp.clear();

        temp.add(2);
        temp.add(3);
        temp.add(4);
        arr.add(new ArrayList<Integer>(temp));
        temp.clear();


        for(ArrayList<Integer> list : arr)
            System.out.println(list);

        System.out.println(adjacent(arr));

    }

    public static int adjacent(ArrayList<ArrayList<Integer>> A) {
        if (A.isEmpty()) {
            return 0;
        }
        int size = A.get(0).size();
        if (size == 0) {
            return 0;
        }

        int prev_sum = 0;
        int last_sum = 0;

        for (int i = 0; i < A.get(0).size(); ++i) {

            int col_sum = Math.max(A.get(0).get(i), A.get(1).get(i)) + prev_sum;
            int res = Math.max(col_sum, last_sum);

            prev_sum = last_sum;
            last_sum = res;
        }
        return Math.max(prev_sum, last_sum);
    }
}

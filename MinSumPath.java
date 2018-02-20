import java.util.ArrayList;

public class MinSumPath {

    public static int minPathSum(ArrayList<ArrayList<Integer>> a) {
        int m = a.size();
        int n = a.get(0).size();
        int[][] grid = new int[m][n];
        grid[0][0] = a.get(0).get(0);

        //initialize top most row
        for(int i = 1; i < n; i++)
            grid[0][i] = grid[0][i-1] + a.get(0).get(i);

        //initialize left most column
        for(int j = 1; j < m; j++)
            grid[j][0] = grid[j-1][0] + a.get(j).get(0);

        //filling table

        for(int i = 1; i <m; i++){
            for(int j = 1; j < n; j++){
                System.out.println(grid[i-1][j] + " i= "+ i + " j= " + j);
                System.out.println(grid[i][j-1] + " i= "+ i + " j= " + j);
                if(grid[i-1][j] > grid[i][j-1])
                    grid[i][j] = grid[i][j-1] + a.get(i).get(j);
                else
                    grid[i][j] = grid[i-1][j] + a.get(i).get(j);
                System.out.println(a.get(i).get(j));
            }
        }

        return grid[m-1][n-1];

    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(3);
        temp.add(2);
        a.add(new ArrayList<Integer>(temp));
        temp.clear();

        temp.add(4);
        temp.add(3);
        temp.add(1);
        a.add(new ArrayList<Integer>(temp));
        temp.clear();

        temp.add(5);
        temp.add(6);
        temp.add(1);
        a.add(new ArrayList<Integer>(temp));
        temp.clear();

        for(ArrayList<Integer> list : a)
            System.out.println(list);

        System.out.println(minPathSum(a));
    }

}

public class UnigueTree {

    public static void main(String[] args){
        int a = 3;
        System.out.println(numTrees(a));
    }

    public static int numTrees(int A) {

        if(A < 0)
            return 0;
        int[] result = new int[A+1];
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i <= A; i++){
            for(int j = 0; j <= i-1; j++){
                result[i] += result[j] * result[i - j - 1];
            }
        }
        return result[A];

    }
}

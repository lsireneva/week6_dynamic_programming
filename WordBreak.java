import java.util.ArrayList;

public class WordBreak {


    public static void main(String[] args) {
        ArrayList<String> B = new ArrayList<String>();
        B.add("trainer");
        B.add("my");
        B.add("interview");
        String A = "myinterviewtrainer";
        System.out.println("Dictionary is : " + B);
        System.out.println("String is  : " + A);
        System.out.println(wordbreak(A, B));

    }

    public static int wordbreak(String A, ArrayList<String> B){
        int[] res = new int[A.length() + 1];
        res[0] = 1;

        for(int i = 0; i < A.length(); i++){
            if(res[i]==0)
                continue;
            for(String word : B){
                int length = word.length();
                int end = i + length;
                if(end > A.length())
                    continue;
                if(res[end]==1)
                    continue;
                if(A.substring(i, end).equals(word))
                    res[end] = 1;
            }
        }
        return res[A.length()];
    }


}


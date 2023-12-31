package ExamenRapido5.Process;
import java.util.*;
public class EightQueen{
    static boolean[] cols,leftDiagonal,rightDiagonal;
    static List<List<Integer> > result = new ArrayList<List<Integer> >();

    public static List<List<Integer>> nQueen(int n) {
        cols = new boolean[n];
        leftDiagonal = new boolean[2*n];
        rightDiagonal = new boolean[2*n];
        result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++)temp.add(0);
        getAllSolutions(result,n,0,temp);

        return result;
    }


    private static void getAllSolutions(List<List<Integer>> result,int n,int row,List<Integer> comb){
        if(row==n){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int col = 0;col<n;col++){
            if(isValidPlace(col, row, n))
                continue;

            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = true;
            comb.set(col,row+1);
            getAllSolutions(result,n,row+1,comb);
            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = false;
        }
    }

    private static boolean isValidPlace(int col, int row, int n){
        return cols[col] || leftDiagonal[row+col] || rightDiagonal[row-col+n];
    }
}
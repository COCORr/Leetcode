import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int lenOfH=matrix.length;
        if (lenOfH==0){
            return new ArrayList<>();
        }
        int lenOfW=matrix[0].length;
        int sum=lenOfH*lenOfW;
        int i=0;
        int j=0;
        int m=lenOfH-1;
        int n=lenOfW-1;
        List<Integer> lis= new ArrayList<>();
        while (true){
            for (int k =i;k<=n;k++){
                lis.add(matrix[j][k]);
                if (lis.size()==sum){
                    return lis;
                }
            }
            for (int k =j+1;k<=m;k++){
                lis.add(matrix[k][n]);
                if (lis.size()==sum){
                    return lis;
                }
            }
            for (int k =n-1;k>=i;k--){
                lis.add(matrix[m][k]);
                if (lis.size()==sum){
                    return lis;
                }
            }
            for (int k =m-1;k>j;k--){
                lis.add(matrix[k][i]);
                if (lis.size()==sum){
                    return lis;
                }
            }
            i++;
            j++;
            m--;
            n--;
        }
    }
}

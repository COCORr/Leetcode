import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  ans=new ArrayList<>();
        if (numRows<1){
            return ans;
        }

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        ans.add(list1);
        List<Integer> temp=list1;

        for (int i=2;i<=numRows;i++){
            List<Integer> listn=new ArrayList<>();
            listn.add(1);
            for (int j = 1;j<i-1;j++){
                listn.add(temp.get(j-1)+temp.get(j));
            }
            listn.add(1);
            ans.add(listn);
            temp=listn;
        }
        return ans;
    }
}

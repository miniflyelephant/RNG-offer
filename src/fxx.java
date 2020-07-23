import com.day.d64;
import com.ljc.*;

public class fxx {
    public static void main(String[] args){
        int[][] a={{1,3,1},{1,5,1},{4,2,1}};
        d64 d=new d64();
       int b=d.minPathSum(a);
        System.out.println(b);
    }
}

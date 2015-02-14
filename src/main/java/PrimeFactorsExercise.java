import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/2/13.
 */
public class PrimeFactorsExercise {
    public List generate(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int factor = 2;
        while (n>1) {
            while (n%factor==0) {
                n/=factor;
                list.add(factor);
            }
            factor++;
        }
        return list;
    }
}

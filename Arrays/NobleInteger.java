import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++)
        {
            if(A.get(i) == A.get(i+1))
            {
                continue;
            }
            
            if(A.get(i) == A.size()-i-1)
            {
                return 1;
            }
        }
        
        if(A.get(A.size()-1) == 0)
        {
            return 1;
        }
        
        return -1;
        
    }
}

//Why Sorting ?
// Suppose there is val at index 2 , if sorting is done we are rest assured that
// all the values to right of index 2 will be greater/equal to 2.i.e what we want to check
// Thus now we just need to count no of ele greater than val at index 2 =>A.size()-i-1
// eg if we have A.size()=5
// val at index 2 =2
// Thus 2 == A.size()-i-1

//Why A.get(A.size()-1
// if we have all negative integers and 0 then 0 will be maximum and will be at end
// after sorting.

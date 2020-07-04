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
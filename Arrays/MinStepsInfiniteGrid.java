import java.util.ArrayList;

public class MinStepsInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int minSteps=0;
        for(int i=0;i<A.size()-1;i++)
        {
            int dx = Math.abs(A.get(i)-A.get(i+1));
            int dy = Math.abs(B.get(i)-B.get(i+1));
            minSteps = minSteps + Math.max(dx,dy);
        }
        return minSteps;
    }
}

// eg1:-
// A = [0, 1, 1]
// B = [0, 1, 2]
// Here x1 = A(0)=0, x2 =A(1)=0
//      y1 = B(0)=1, y2 =B(1)=1
//      Thus steps req to jump from 0,0 to 1,1 is 1, We take max value

import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> igStack = new Stack<Integer>();
        
        for( int in : ingredient  ) {
            igStack.push(in);
            
            if(igStack.size() >= 4){
            
            if (igStack.get(igStack.size()-4) == 1
                && igStack.get(igStack.size()-3) == 2
                && igStack.get(igStack.size()-2) == 3
                && igStack.get(igStack.size()-1) == 1) {
                answer ++; 
                    igStack.pop();
					igStack.pop();
					igStack.pop();
					igStack.pop();
            }
            }
        }
        
        return answer;
    }
}
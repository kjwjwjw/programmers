import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        int b = 0;

       for(int i=0; i<s.length() ; i++) {
           if(s.charAt(i) == 'p'  || s.charAt(i) == 'P')
                        a++;
            
       }
        
        for(int j=0; j<s.length() ; j++) {
            if(s.charAt(j) == 'y' || s.charAt(j) == 'Y') 
                b++;
            
        }
        
        if ( a != b) {
            answer = false;
        }
        
        

        return answer;
    }
}
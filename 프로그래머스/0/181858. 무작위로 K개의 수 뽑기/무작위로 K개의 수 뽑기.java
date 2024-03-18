import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int [] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        
        int[] kArr = Arrays.stream(arr).distinct().toArray();
       
        int kArrlength = kArr.length;
        
        for(int i=0 ; i< answer.length; i++) {
            if(kArrlength != 0) {
                kArrlength --;
                answer[i] = kArr[i];
            } else {
                answer[i] = -1;
            }
            
        }       
        return answer;
    }
}
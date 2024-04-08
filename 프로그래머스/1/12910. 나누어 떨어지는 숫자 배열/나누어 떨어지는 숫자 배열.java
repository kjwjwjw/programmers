import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        for(int i =0 ; i< arr.length; i++) {
            if( arr[i] % divisor == 0 ) {
                arr2.add(arr[i]);
                
            }
        }
         if(arr2.size()==0){
            arr2.add(-1);
        }
        
      
        answer = new int[arr2.size()];
        
        for (int j = 0; j < arr2.size(); j++) {
                answer[j] = arr2.get(j);
            }
        Arrays.sort(answer);
         return answer;
    }
             
}
class Solution {
    public int[] solution(int n, int k) {
        int a = n/k;
        int[] answer = new int[a];
       
      
         for(int i = 0; i<a; i++) 
             answer[i] = k * ( i + 1);
        
        
        return answer;
      
    }
}

   
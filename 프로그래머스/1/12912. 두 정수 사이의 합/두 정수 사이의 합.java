class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        
        c = (a>b) ? a-b : b-a ;
        
        if(a > b) {
        for(int i= b ; i<= a ; i++) {
            answer += i;
            } 
        } 
         for(int i= a ; i<= b ; i++) {
            answer += i;
            } 
        return answer;
    }
}
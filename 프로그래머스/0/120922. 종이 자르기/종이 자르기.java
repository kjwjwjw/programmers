class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int size  = M*N;
        
        if ( size !=0 ) {
            answer = size-1;
        }
        return answer;
    }
}
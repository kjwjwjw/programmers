class Solution {
    public int[] solution(long n) {
       String s = String.valueOf(n);
        
       int[] answer = new int[s.length()];
        
          int cnt=0;

      while(n > 0) {
        answer[cnt]=(int)(n%10);
        n/=10;
        System.out.println(n);
        cnt++;
    }
        
        return answer;
    }
}
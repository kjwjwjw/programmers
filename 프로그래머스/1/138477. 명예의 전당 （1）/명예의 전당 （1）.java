import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 명예의 전당 (매일 변경)
        List<Integer> showList = new ArrayList(); 

        for(int i=0; i < score.length; i++) {
            if(i < k) {
                showList.add(score[i]);
            }
            else {
                // score[i] 와 list 내 값 비교
                if(score[i] >= showList.get(0)){
                    showList.remove(0);
                    showList.add(score[i]);
                }
            }
            Collections.sort(showList);
            answer[i] = showList.get(0);
        }
        return answer;
    }
}
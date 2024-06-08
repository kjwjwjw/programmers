import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
                 int answer = 0;
        // 사과 점수 오름차순 정렬
        Integer[] newScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(newScore);

        // 남는 사과는 버림
        int size = newScore.length-1;
        for(int j=1; j <= score.length/m; j++){
            Integer[] box = new Integer[m]; // 박스에 담긴 사과
            for(int i = 0; i < m; i++) {
                box[i] = newScore[size]; // 높은 점수부터 담기
                size--;
            }
            // 가장 낮은 점수 * m
            answer += box[m-1] * m;
        }
        return answer;
    }
}
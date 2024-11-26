import java.util.*;

class Solution {
    // 조합의 합을 저장할 HashSet
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(int[] elements) {
        // 배열의 길이
        int n = elements.length;
        
        // 1부터 배열 길이까지의 조합 크기를 설정
        for (int r = 1; r <= n; r++) {
            // 원형 조합 생성 함수 호출
            circleCombination(elements, 0, n, r);
        }
        
        // 중복되지 않는 조합의 합의 개수를 반환
        return set.size();
    }
    
    // 원형 조합 생성 함수
    // start : 현재 위치, n : 배열 길이, r : 조합 크기
    public void circleCombination(int[] elements, int start, int n, int r) {
        if (start == n) {
            return;
        }
        // 조합의 합을 계산하여 집합에 추가
        sumCombination(elements, start, n, r);
        // 다음 위치로 이동하여 재귀 호출
        circleCombination(elements, start+1, n, r);
    }
    
    // 해당 조합의 합을 계산하여 집합에 추가하는 함수
    public void sumCombination(int[] elements, int start, int n, int r) {
        int result = 0;
        // start부터 start+r까지의 원형 조합을 계산
        for (int i = start; i < start + r; i++) {
            result += elements[i % n]; // 원형 배열의 특성을 고려하여 인덱스 계산
        }
        set.add(result); // 조합의 합을 집합에 추가
    }
}

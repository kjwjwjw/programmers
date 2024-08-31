import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int result = 0; // 조건을 만족하는 경우의 수를 저장하는 변수
        
        // 첫 번째와 두 번째 파트를 각각 추적하는 HashMap 초기화
        HashMap<Integer, Integer> map1 = new HashMap<>(); // 첫 번째 파트의 토핑 개수를 저장
        HashMap<Integer, Integer> map2 = new HashMap<>(); // 두 번째 파트의 토핑 개수를 저장
        
        int n = topping.length;
        
        // 첫 번째 토핑을 map1에 추가
        map1.put(topping[0], 1);
        
        // 나머지 토핑들을 map2에 추가
        for (int i = 1; i < n; i++) {
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
        }
        
        int point = 1; // 두 파트를 구분하는 지점 초기화
        
        // 두 파트의 크기를 비교하며 반복
        while (point < n - 1) {
            if (map1.size() == map2.size()) {
                result++; // 두 파트의 크기가 같을 때 경우의 수 증가
            }
            
            int key = topping[point]; // 현재 토핑
            
            // 현재 토핑을 첫 번째 파트에 추가
            map1.put(key, map1.getOrDefault(key, 0) + 1);
            
            // 두 번째 파트에서 현재 토핑을 제거 (또는 개수를 감소)
            if (map2.get(key) == 1) {
                map2.remove(key);
            } else {
                map2.put(key, map2.get(key) - 1);
            }
            
            point++; // 다음 토핑으로 이동
        }
        
        return result; // 조건을 만족하는 경우의 수 반환
    }
}
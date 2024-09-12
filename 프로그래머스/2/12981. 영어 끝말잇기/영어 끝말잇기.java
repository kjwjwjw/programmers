import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 사용한 단어를 저장하는 리스트
        ArrayList<String> usedWords = new ArrayList<>();
        
        // 첫 단어는 규칙에 무조건 맞기 때문에 리스트에 추가
        usedWords.add(words[0]);
        
        // 두 번째 단어부터 검사
        for (int i = 1; i < words.length; i++) {
            String word = words[i]; // 현재 단어
            
            // 사용했던 단어인지 확인
            if (usedWords.contains(word)) {
                // 현재 단어를 말한 사람의 번호와 차례를 반환
                return new int[] {i % n + 1, i / n + 1};
            }
            
            String lastWord = usedWords.get(i - 1); // 이전 단어
            
            // 이전 단어의 마지막 알파벳이 현재 단어의 첫 알파벳과 다른 경우
            if (lastWord.charAt(lastWord.length() - 1) != word.charAt(0)) {
                // 현재 단어를 말한 사람의 번호와 차례를 반환
                return new int[] {i % n + 1, i / n + 1};
            }
            
            // 현재 단어를 사용한 단어 리스트에 추가
            usedWords.add(word);
        }
        
        // 모든 단어가 규칙에 맞게 사용된 경우 [0, 0] 반환
        return new int[] {0, 0};
    }
}
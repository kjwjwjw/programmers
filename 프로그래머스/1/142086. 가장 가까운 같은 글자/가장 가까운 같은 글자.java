import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> a = new HashMap<>();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            Character temp = s.charAt(i);
            if(i == 0){
                answer[i] = -1;
            }
            else{
                if(a.getOrDefault(temp, -1) == -1){
                    answer[i] = -1;
                }
                else{
                    answer[i] = i - a.get(temp);

                }
            }
            a.put(temp, i);
        }

        return answer;
    }
}
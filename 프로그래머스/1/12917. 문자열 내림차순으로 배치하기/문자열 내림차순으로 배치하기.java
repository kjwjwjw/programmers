import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public String solution(String s) {
		ArrayList<Character> list = new ArrayList<>();
      
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		Collections.sort(list);
      
		StringBuilder sb = new StringBuilder();
      
		while (list.size() > 0) {
			sb.append(list.remove(list.size() - 1));
		}
      
        return sb.toString();
  }
}
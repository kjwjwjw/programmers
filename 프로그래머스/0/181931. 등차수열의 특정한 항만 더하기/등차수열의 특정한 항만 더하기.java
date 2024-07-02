import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        List<Integer> common_difference = new ArrayList<>();
        List<Integer> trueIdx = new ArrayList<>();
        int temp, result = 0;

        // 등차수열 만들고, true 의 인덱스를 구한다.
        for (int i = 0; i < included.length; i++) {
            common_difference.add(a + (i * d));
            if (included[i])
                trueIdx.add(i);
        }

        // 등차수열에서 true 의 인덱스를 뽑아 더한다.
        for (int index : trueIdx) {
            result += common_difference.get(index);
        }
        return result;
    }
}
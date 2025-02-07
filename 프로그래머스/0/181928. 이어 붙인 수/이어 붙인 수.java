class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] multi = {1, 1};

        for (int i = num_list.length - 1; 0 <= i; i--){
            int index = num_list[i] % 2;
            answer += num_list[i] * multi[index];
            multi[index] *= 10;
        }



        return answer;
    }
}
import java.util.*;
class Solution {
    static class Test{
        int target1;
        int target2;
        int num; // +1 해서 기록 
        char check;
        public boolean check (int target1_index, int target2_index){
            int distance = Math.abs(target1_index - target2_index);
            if(check == '=' && distance == num) return true;
            else if(check == '>' && distance > num) return true;
            else if(check == '<' && distance < num) return true;
            return false;
        }
        // 생성자 
        public Test (int target1, int target2, int num, char check){
            this.target1 = target1;
            this.target2 = target2;
            this.num = num;
            this.check = check;
        }
    }
    static HashMap<Character, Integer> map = new HashMap<>();
    static int answer = 0;
    static boolean [] visited = new boolean [8];
    static int [] memo = new int [8];
    static Test [] condition;
    public int solution(int n, String[] data) {
        answer = 0; 
        init();
        init2(data, n);
        backTracking(0);
        return answer;
    }
    public static void check(){
        int [] index = new int [8];
        for(int i = 0; i < 8; i++){
            index[memo[i]] = i;
        }
        for(Test test : condition){
            int tar1 = test.target1;
            int tar2 = test.target2;
            boolean flag = test.check(index[tar1], index[tar2]);
            if(!flag) return;
        }
        answer++;
    }
    public static void backTracking(int depth){
        if(depth == 8){
            check();
            return;
        }
        for(int i = 0; i < 8; i++){
            if(visited[i]) continue;
            visited[i] = true;
            memo[depth] = i;
            backTracking(depth + 1);
            visited[i] = false;
        }
    }
    public static void init2(String [] data, int n){
        condition = new Test [n];
        int cnt = 0;
        for(String cur : data){
            char tar1 = cur.charAt(0);
            char tar2 = cur.charAt(2);
            char check = cur.charAt(3); 
            int num = cur.charAt(4) - '0' + 1;
            Test test = new Test(map.get(tar1), map.get(tar2), num, check);
            condition[cnt++] = test;
        }
    }
    public static void init(){
        map.put('A', 0);
        map.put('C', 1);
        map.put('F', 2);
        map.put('J', 3);
        map.put('M', 4);
        map.put('N', 5);
        map.put('R', 6);
        map.put('T', 7);
    }
}

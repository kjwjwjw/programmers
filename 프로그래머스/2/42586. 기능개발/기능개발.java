import java.util.*;

class Solution {
    public ArrayList<Integer>  solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> que = new LinkedList<Integer>();

        for(int i=0; i < progresses.length; i++){ // queue
            que.offer(progresses[i]);
        }

        int[] result = progresses;
        int resultIndex=0;


        while(!que.isEmpty()){
            for(int i=progresses.length-que.size(); i < progresses.length; i++){
                result[i]=result[i]+speeds[i];
            }
            System.out.println();
            int tmp = que.size();
            int overNum=0;

            for(int j=progresses.length-tmp; j<progresses.length; j++){     
                if(result[j] >= 100){
                    overNum++;
                    que.poll();

                    if(que.size()==0){
                        answer.add(overNum);
                        return answer;
                    } else {
                        continue;    
                    }
                } else if(overNum>0) {
                    answer.add(overNum);
                    break;
                } else {
                    break;
                }
            }

        }
        return answer;
    }
}
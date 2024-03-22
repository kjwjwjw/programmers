import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();

        while( x --> 0 ) {
            int value = Integer.parseInt(br.readLine());
            if(value ==0) {
                if(myQueue.isEmpty()){
                    sb.append("0").append("\n");
                } else {
                    sb.append(myQueue.poll()).append("\n");
                }
            } else {
                myQueue.add(value);
            }
        }


        System.out.println(sb.toString());
        br.close();
    }
}

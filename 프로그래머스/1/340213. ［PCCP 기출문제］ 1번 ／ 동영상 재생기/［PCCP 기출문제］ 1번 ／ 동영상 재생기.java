import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videotime = convertion(video_len);
        int postime = convertion(pos);
        int optime = convertion(op_start);
        int edtime = convertion(op_end);
        if(postime>=optime && postime <= edtime) //오프닝 건너뛰기
                postime = edtime;
        for(String command : commands) //커맨드 시작
        {           
            if(command.equals("next"))
                postime += 10;
            else
                postime -= 10;

            if(postime > videotime) //초과 방지
                postime = videotime;
            else if(postime <0) //초과 감소 방지
                postime = 0;

            if(postime>=optime && postime <= edtime) //오프닝 건너뛰기
                postime = edtime;

        }

        String hr = String.valueOf(postime/60);
        String mi = String.valueOf(postime%60);
        if(postime/60 <10)
            hr="0"+hr;
        if(postime%60 <10)
            mi="0"+mi;

        String answer = hr+":"+mi;
        return answer;
    }

    public int convertion(String time){ //시간변환
        String hour = time.substring(0,2);
        String min = time.substring(3,5);
        int hourtomin = 60*(Integer.parseInt(hour));
        int mintime = Integer.parseInt(min);
        int convertionTime = hourtomin+mintime;
        return convertionTime;
}
}
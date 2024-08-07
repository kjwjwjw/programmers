class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        
        // 카펫 전체 크기
        int area = brown + yellow;
        
        // 가로 세로 길이 초기 값
        // 세로가 3인 이유는 갈색 타일로 테두리를 두를려면 최소 3의 높이가 있어야 하기 때문
        int w;
        int h = 3;
        
        
        while (true) {
            // 만약 전체 넓이가 h로 나누어지지 않을 경우
            if (area % h != 0) {
                // 높이를 1 추가하고 다시 시작하기
                h++;
                continue;
            }
            
            // 가로 길이 구하기
            w = area / h;
            
            // 좌우상하 테두리를 뺀 값의 넓이가 노란색 타일의 수와 같은지 비교
            if ((w-2) * (h-2) == yellow) {
                return new int[] {w,h};
            }
            h++;
        }
        // 문제를 읽으면 아시겠지만 테두리 1줄은 갈색으로 이루어져있습니다
        // 즉 테두리를 제외한 넓이는 노란색 타일의 개수와 같습니다
        // 테두리를 제외한 넓이 (w-2) * (h-2)
    }
}
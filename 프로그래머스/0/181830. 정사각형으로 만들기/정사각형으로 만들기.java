class Solution {
    public int[][] solution(int[][] arr) {
        // 배열의 행 수와 열 수 중 더 큰 값을 찾습니다.
        int n = Math.max(arr.length, arr[0].length);
        
        // n x n 크기의 새로운 2차원 배열을 생성합니다. 기본값은 0입니다.
        int[][] result = new int[n][n];
        
        // 주어진 배열의 각 원소를 새로운 배열로 복사합니다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        
        // 결과 배열을 반환합니다.
        return result;
    }
}
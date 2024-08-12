class Solution {
    private int answer = 0;
    private long[] arr;
    private void dfs(int n, int depth, long l, long r, long k) {
        int mul = n - depth;
        long end = k * arr[mul];
        long start = end - arr[mul] + 1;
        if (l <= start && end <= r) {
            answer += (int) Math.pow(4, mul);
            return;
        }
        if (end < l || start > r) {
            return;
        }

        long x = k * 5;
        dfs(n, depth + 1, l, r, x - 4);
        dfs(n, depth + 1, l, r, x - 3);
        dfs(n, depth + 1, l, r, x - 1);
        dfs(n, depth + 1, l, r, x);
    }

    public int solution(int n, long l, long r) {
        arr = new long[n + 1];
        long k = 1;
        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            k *= 5;
            arr[i] = k;
        }

        dfs(n, 0, l, r, 1);
        return answer;
    }
}
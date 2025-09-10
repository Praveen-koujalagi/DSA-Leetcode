class Solution {
    public int uniquePaths(int m, int n) {
        return (int) nCr(m + n - 2, m - 1);
    }

    private long nCr(int n, int r) {
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return res;
    }
}

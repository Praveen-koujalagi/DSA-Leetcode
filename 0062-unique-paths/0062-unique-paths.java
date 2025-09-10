class Solution {
    public int uniquePaths(int m, int n) {
       int nm1fact = public static int factorial(int n) { // (n-1)!
           if (n == 0 || n == 1) return 1;
           else return n * factorial(n - 1);
        }    

        int mm1fact = public static int factorial(int n) { // (m-1)!
            if (n == 0 || n == 1) return 1;
            else return n * factorial(n - 1);
        }   
        return ((n-1)+(m-1)) / (nm1fact *)
    }
}
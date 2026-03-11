import java.util.Arrays;

class Solution {
    final int M = 1000000007;
    int[][][] t;

    public int solve(int zerosLeft, int onesLeft, int lastWithOne, int limit) {
        // Base case: used all numbers
        if (zerosLeft == 0 && onesLeft == 0) return 1;
        
        // Memoization lookup
        if (t[zerosLeft][onesLeft][lastWithOne] != -1) {
            return t[zerosLeft][onesLeft][lastWithOne];
        }

        long result = 0;

        // If last block was 1s (or we are starting), try placing a block of 0s
        if (lastWithOne == 1) {
            for (int len = 1; len <= Math.min(limit, zerosLeft); len++) {
                result = (result + solve(zerosLeft - len, onesLeft, 0, limit)) % M;
            }
        } 
        // If last block was 0s (or we are starting), try placing a block of 1s
        else {
            for (int len = 1; len <= Math.min(limit, onesLeft); len++) {
                result = (result + solve(zerosLeft, onesLeft - len, 1, limit)) % M;
            }
        }

        return t[zerosLeft][onesLeft][lastWithOne] = (int) result;
    }

    public int numberOfStableArrays(int zero, int one, int limit) {
        t = new int[zero + 1][one + 1][2];
        for (int[][] row : t) for (int[] col : row) Arrays.fill(col, -1);

        // We can start with a block of 0s OR a block of 1s
        // We pass '1' to indicate we want to place 0s, and '0' to place 1s
        long startWithZero = 0;
        for (int len = 1; len <= Math.min(limit, zero); len++) {
            startWithZero = (startWithZero + solve(zero - len, one, 0, limit)) % M;
        }

        long startWithOne = 0;
        for (int len = 1; len <= Math.min(limit, one); len++) {
            startWithOne = (startWithOne + solve(zero, one - len, 1, limit)) % M;
        }

        return (int) ((startWithZero + startWithOne) % M);
    }
}
class Leetcode59_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int result[][]=new int[n][n];
        int left=0; int right=n-1;
        int top=0;  int bottom=n-1;
        int num=1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                result[top][j]=num++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                result[j][right]=num++;
            }
            right--;
            for(int j=right;j>=left;j--){
                result[bottom][j]=num++;
            }
            bottom--;
            for(int j=bottom;j>=top;j--){
                result[j][left]=num++;
            }
            left++;
        }
        return result;
    }
}
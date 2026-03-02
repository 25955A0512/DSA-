class Leetcode_1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){ //90,180,270
        if(Arrays.deepEquals(mat,target)){
            return true;
        }
        rotate(mat);
        }
        return false;
    }
        public void rotate(int[][] mat){
       int n=mat.length;
       for(int i=0; i<n;i++){
        for(int j=i;j<n;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[i][n-1-j];
            mat[i][n-1-j]=temp;
        }
       }
        }
}
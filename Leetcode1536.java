class Leetcode1536 {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int endzeros[]=new int[n];
        int steps=0;
        for(int i=0;i<n;i++){
            int j=n-1;
            int count=0;
            while(j>=0 && grid[i][j]==0){
                count++;
                j--;
            }
            endzeros[i]=count;
        }
        for(int i=0;i<n;i++){
            int need=n-i-1;
            int j=i;
            while(j<n && endzeros[j]<need){
                j++;
            }
            if(j==n){
                return -1;
            }
            steps+=j-i;
            while(j>i){
                int temp=endzeros[j];
                endzeros[j]=endzeros[j-1];
                endzeros[j-1]=temp;
                j--;
            }
        }
        return steps;
    }
}
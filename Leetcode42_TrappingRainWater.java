class Leetcode42_TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
        int prefixmax[]=new int[n];
        int suffixmax[]=new int[n];
        prefixmax[0]=height[0];
        suffixmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffixmax[i]=Math.max(suffixmax[i+1],height[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
                total+=Math.min(prefixmax[i],suffixmax[i])-height[i];
            }
        return total;
    }
}
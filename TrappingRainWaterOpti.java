class TrappingRainWaterOpti {
    public int trap(int[] height) {
        int n=height.length;
        int Lmax=0;int Rmax=0; int total=0; int l=0;
        int r=n-1;
        while(l<r){
            if(height[l]<=height[r]){
            if(Lmax>height[l]){
                total+=Lmax-height[l];
            }else{
                Lmax=height[l];
            }
            l++;
            }else{
                if(Rmax>height[r]){
                    total+=Rmax-height[r];
                }else{
                    Rmax=height[r];
                }
                r--;
            }
        }
        return total;
    }
}
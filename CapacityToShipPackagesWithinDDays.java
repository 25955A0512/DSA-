class CapacityToShipPackagesWithinDDays {
    boolean isPossible(int weights[], int mid, int days){
        int sum=0, count=1;
        for(int num:weights){
            if((sum+num)>mid){
                sum=num;
                count++;
            }else{
                sum+=num;
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0, maxval=Integer.MIN_VALUE, ans=-1;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            maxval=Math.max(maxval, weights[i]);
        }
        int start=maxval, end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(weights, mid, days)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
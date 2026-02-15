class SplitArrayLargestSum {
    boolean isPossible(int nums[], int mid, int k){
        int sum=0, count=1;
        for(int num:nums){
            if((sum+num)>mid){
                count++;
                sum=num;
            }else{
                sum+=num;
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0, maxval=Integer.MIN_VALUE, ans=-1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxval=Math.max(maxval, nums[i]);
        }
        int start=maxval, end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(nums,mid,k)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
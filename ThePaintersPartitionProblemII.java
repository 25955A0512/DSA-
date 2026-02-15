class ThePaintersPartitionProblemII {
        boolean isPossible(int arr[], int n, int k, int maxAllowedTime){
        int painter=1, time=0;
        for(int i=0;i<n;i++){
            if (arr[i] > maxAllowedTime) return false;
            if(time+arr[i] <= maxAllowedTime){
                time+=arr[i];
            }else{
                painter++;
                time=arr[i];
            }
        }
        return painter<=k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int n=arr.length;
        int sum=0; int maxval=Integer.MIN_VALUE; int ans=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxval=Math.max(maxval, arr[i]);
        }
        int start=maxval, end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,n,k,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}

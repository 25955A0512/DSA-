class Leetcode_31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int indx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
        }
        if(indx==-1){
            reverse(nums,indx+1,n-1);
            return;
        }
        //to find the smallest greatest number
        for(int i=n-1;i>indx;i--){
            if(nums[i]>nums[indx]){
                swap(nums,i,indx);
                break;
            }
        }
        reverse(nums,indx+1,n-1);
    }
    private static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}
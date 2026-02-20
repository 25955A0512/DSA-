class Leetcode_2149_RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int positiveIn=0, negativeIn=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[positiveIn]=nums[i];
                positiveIn+=2;
            }else{
                arr[negativeIn]=nums[i];
                negativeIn+=2;
            }
        }
        return arr;
    }
}
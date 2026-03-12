class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        long maxsum=0;
        long currentwindowsum=0;
        int i=0; int j=0;
        while(j<n){
            while(set.contains(nums[j])){
                currentwindowsum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            currentwindowsum+=nums[j];
            set.add(nums[j]);
            if(j-i+1==k){
                maxsum=Math.max(currentwindowsum,maxsum);
                currentwindowsum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return maxsum;
    }
}
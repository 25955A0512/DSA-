class LeetCode_128_LongestConsecutiveSequence { //better solution
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        int lastelement=Integer.MIN_VALUE;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastelement){
                count+=1;
                lastelement=nums[i];
            }else if(lastelement != nums[i]){
                count=1;
                lastelement=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}

class Solution { // optimal solution
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int x=num;
                while(set.contains(x+1)){
                    x=x+1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }

        }
        return longest;
    }
}
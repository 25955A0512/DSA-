class Leetcode_1 { //brute force solution
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}


class Leetcode_1 { //optimal solution
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
             int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[] {i,map.get(rem)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};

    }
}
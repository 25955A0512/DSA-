class Leetcode_169_MajorityElement { //better solution
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                 ans= key;
            }
        }
        return ans;
    }
}


class Leetcode_169_MajorityElement  { //optimal solution
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                count++;
            }else{
                count--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) cnt1++;
        }
        if(cnt1>(n/2)) return el;
        return -1;
    }
}
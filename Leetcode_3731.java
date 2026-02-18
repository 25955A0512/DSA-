class Leetcode_3731 {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE; 
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        
        for(int i=min;i<=max;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i) {
                flag=1;
                 break;
                }
            }
            if(flag==0){
                list.add(i);
            }
        }
        return list;
    }
}



class Leetcode_3731 {//HashSet Approach
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE; 
        int min=Integer.MAX_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;        
    }
}
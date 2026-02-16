import java.util.*;
class ContainsDuplicateII { // change the class name to Solution if you are using gfg or leetcode
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
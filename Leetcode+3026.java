
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Long> minPrefixMap = new HashMap<>();
        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int currentVal = nums[i];
            int target1 = currentVal - k;
            int target2 = currentVal + k;
            if (minPrefixMap.containsKey(target1)) {
                long currentSubarraySum = (prefixSum + currentVal) - minPrefixMap.get(target1);
                maxSum = Math.max(maxSum, currentSubarraySum);
                found = true;
            }
            if (minPrefixMap.containsKey(target2)) {
                long currentSubarraySum = (prefixSum + currentVal) - minPrefixMap.get(target2);
                maxSum = Math.max(maxSum, currentSubarraySum);
                found = true;
            }
            if (!minPrefixMap.containsKey(currentVal) || prefixSum < minPrefixMap.get(currentVal)) {
                minPrefixMap.put(currentVal, prefixSum);
            }
            prefixSum += currentVal;
        }
        return found ? maxSum : 0;
    }
}
class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0;
        long minTime = workerTimes[0];
        for (int w : workerTimes) minTime = Math.min(minTime, w);
        long right = minTime * (long)mountainHeight * (mountainHeight + 1) / 2;
        long result = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canFinish(mid, workerTimes, mountainHeight)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private boolean canFinish(long totalTime, int[] workerTimes, int mountainHeight) {
        long totalReduced = 0;
        for (int w : workerTimes) {
            long k = (long) ((-1 + Math.sqrt(1 + 8.0 * totalTime / w)) / 2);
            totalReduced += k;
            
            if (totalReduced >= mountainHeight) return true;
        }
        return totalReduced >= mountainHeight;
    }
}
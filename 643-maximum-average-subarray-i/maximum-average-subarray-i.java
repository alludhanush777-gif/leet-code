class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        long maxsum = Long.MIN_VALUE;
        long cursum = 0;
        for (int right = 0; right < nums.length; right++) {
            cursum += nums[right];
            if (right - left + 1 > k) {
                cursum -= nums[left];
                left++;
            }
            if (right - left + 1 == k) {
                maxsum = Math.max(maxsum, cursum);
            }
        }
        return (double) maxsum / k;
    }
}
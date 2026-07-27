class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, count = 0;
        long maxsum = Long.MIN_VALUE;
        long cursum = 0;
        for (int right = 0; right < arr.length; right++) {
            cursum += arr[right];
            if (right - left + 1 > k) {
                cursum -= arr[left];
                left++;
            }
            if (right - left + 1 == k) {
                maxsum = cursum;
                int newAvg = (int)(maxsum / k);
                if (newAvg >= threshold) {
                    count++;
                }
            }
        }
        return count;
    }
}
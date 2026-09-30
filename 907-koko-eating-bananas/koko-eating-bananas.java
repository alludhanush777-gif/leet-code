class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isTaskComplete(mid, piles, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean isTaskComplete(int mid, int[] piles, int h) {

        int time = 0;

        for (int i = 0; i < piles.length; i++) {
            time += (piles[i] + mid - 1) / mid;

            if (time > h) {
                return false;
            }
        }

        return true;
    }
}
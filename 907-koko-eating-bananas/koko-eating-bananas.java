class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minK = 1;
        int maxK = 0;
        for (int p : piles) {
            maxK = Math.max(maxK, p);
        }

        while (minK < maxK) {
            int mid = minK + (maxK - minK) / 2;

            if (canEatAll(piles, h, mid)) {
                maxK = mid;
            } else {
                minK = mid + 1;
            }
        }

        return minK;
    }

    public boolean canEatAll(int[] piles, int hours, int k) {
        int currHours = 0;
        for (int p : piles) {
            currHours += (p + k - 1) / k;
        }
        return currHours <= hours;
    }
}
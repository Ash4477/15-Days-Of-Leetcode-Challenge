class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        for (int i=0; i<k; i++) currSum += nums[i];
        double maxAvg = currSum/k;

        for (int i=k; i<nums.length; i++) {
            currSum = currSum - nums[i-k] + nums[i];
            double newAvg = currSum/k;
            if (newAvg > maxAvg) maxAvg = newAvg;
        }

        return maxAvg;
    }
}
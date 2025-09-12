class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int i=0; i<n; i++) {
            totalSum += nums[i];
            nums[i] = totalSum;
        }

        return nums;
    }
}
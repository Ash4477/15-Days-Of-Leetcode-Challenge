class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            totalSum += nums[i];
            result[i] = totalSum;
        }

        return result;
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int totalSum = 0;
        for (int i=0; i<nums.length; i++) {
            totalSum += nums[i];
            output[i] = totalSum;
        }
        return output;
    }
}
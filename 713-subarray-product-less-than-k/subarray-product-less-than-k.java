class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k <= 1 || n == 0) return 0;
        int result = 0;
        int product = 1;

        int left = 0;
        for (int right=0; right<n; right++) {
            product *= nums[right];
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            result += right-left+1;
        }
        return result;
    }
}
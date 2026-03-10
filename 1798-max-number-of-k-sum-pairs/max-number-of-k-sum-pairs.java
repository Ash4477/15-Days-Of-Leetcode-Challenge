class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int ops = 0;
        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                ops++;
                left++;
                right--;
            } else {
                if (sum > k) right--;
                else left++;
            }
        }

        return ops;
    }
}
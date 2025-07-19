class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] temp = new int[k];
        int tempIdx = 0;
        for (int i=(nums.length-k); i<nums.length; i++) {
            temp[tempIdx++] = nums[i];
        }

        for (int i = nums.length-k-1; i>=0; i--) {
            nums[i+k] = nums[i];
        }

        for (int i=0; i<k; i++) {
            nums[i] = temp[i];
        }
    }
}
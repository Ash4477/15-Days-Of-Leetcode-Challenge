class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            if (nums[left] == 0) {
                for (int i=left; i<right;i++) {
                    nums[i] = nums[i+1];
                }
                nums[right--] = 0;
            }
            else {
            left++;
            }
        }

    }
}
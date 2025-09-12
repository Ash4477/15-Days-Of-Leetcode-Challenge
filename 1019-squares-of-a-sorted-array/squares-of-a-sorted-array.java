class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[right+1];
        int resIdx = right;

        while (left <= right)  {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];

            if (leftSqr > rightSqr) {
                result[resIdx--] = leftSqr;
                left++;
            } else {
                result[resIdx--] = rightSqr;
                right--;
            }
        }

        return result;
    }
}
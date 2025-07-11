class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int resultIdx = n-1;
        int[] result = new int[n];

        while (left <= right) {
            int rightSqr = nums[right]*nums[right];
            int leftSqr = nums[left]*nums[left];
            if (leftSqr > rightSqr) {
                result[resultIdx--] = leftSqr;
                left++;
            }
            else {
                result[resultIdx--] = rightSqr;
                right--;
            }
        }
        return result;
    }
}
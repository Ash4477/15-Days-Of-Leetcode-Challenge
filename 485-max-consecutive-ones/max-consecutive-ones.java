class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1s = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            while (i < nums.length && nums[i] == 1) {
                count++;
                i++;
            }
             if (count > max1s) {
                max1s = count;
            }
            count = 0;
        }
        return max1s;
    }
}
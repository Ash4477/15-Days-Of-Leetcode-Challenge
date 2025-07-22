class Solution {
    public int[] runningSum(int[] nums) {
        int tot = 0;
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            tot+=nums[i];
            res[i] = tot;
        }
        return res;
    }
}
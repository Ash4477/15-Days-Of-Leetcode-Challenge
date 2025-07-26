class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int op = 1, ep = 0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]%2==0) {
                res[ep] = nums[i];
                ep+=2;
            } else {
                res[op] = nums[i];
                op+=2;
            }
        }
        return res;
    }
}
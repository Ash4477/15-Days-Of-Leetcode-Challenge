class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int currProd = nums[0];
        ans[0] = 1;
        for (int i=1; i<n; i++) {
            ans[i] = currProd;
            currProd *= nums[i];
        }

        currProd = nums[n-1];
        for (int i = n-2; i>=0; i--) {
            ans[i] *= currProd;
            currProd *= nums[i];
        }

        return ans;
    }
}
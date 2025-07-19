class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        int resIdx = 0;
        for (int i=0; i<n;i++) {
            result[resIdx++] = nums[i];
            result[resIdx++] = nums[i+n];
            System.out.println(3);
        }
        return result;
    }
}
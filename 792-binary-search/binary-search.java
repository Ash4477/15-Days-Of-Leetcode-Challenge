class Solution {
    public int search(int[] nums, int target) {
        return helperFn(nums, 0, nums.length-1, target);
    }

    public int helperFn(int[] nums, int start, int end, int target) {
        if (start > end) return -1;

        int midIdx = start + (end-start) / 2;
        
        if (nums[midIdx] == target) return midIdx;
        
        if (target < nums[midIdx]) return helperFn(nums, start, midIdx-1, target);
        return helperFn(nums, midIdx+1, end, target);
        
    }
}
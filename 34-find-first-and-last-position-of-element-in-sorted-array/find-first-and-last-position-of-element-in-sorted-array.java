class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        return new int[] {first, last};
    }

    private int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length-1;
        int idx = -1;

        while (start <= end) {
            int mid = start + ((end-start) / 2);
            if (nums[mid] == target) {
                idx = mid;
                if (isFirst) end = mid-1;
                else start = mid+1;
            }
            else if (nums[mid] < target) start = mid+1;
            else end = mid-1;
        }

        return idx;
    }
}
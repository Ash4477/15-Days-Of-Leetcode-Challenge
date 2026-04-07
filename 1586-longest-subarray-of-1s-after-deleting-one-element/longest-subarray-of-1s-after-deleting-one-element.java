class Solution {
    public int longestSubarray(int[] nums) {
        boolean deleted = false;
        int maxCount = 0;
        int right;
        
        for (right=0; right<nums.length; right++) {
            if (nums[right] == 0) {
                if (!deleted) {
                    deleted = true;
                    continue;
                }
                else break;
            }
            maxCount++;
        }

        int currCount = maxCount;
        int left = 0;
        while (right < nums.length) {
            if (nums[right] == 0 && deleted) {
                if (nums[left++] == 0) {
                    deleted = false;
                    continue;
                }
                currCount--;
            }

            else if (nums[right] == 0) {
                deleted = true;
                right++;
            }

            else {
                currCount++;
                right++;
            }
            if (currCount > maxCount) maxCount = currCount;
        }

        return deleted ? maxCount : (maxCount-1);
    }
}

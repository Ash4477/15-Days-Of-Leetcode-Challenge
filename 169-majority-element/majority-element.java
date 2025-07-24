class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            int curr = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], curr);
            if (curr > count) {
                res = nums[i];
                count = curr;
            }
        }

        return res;
    }
}
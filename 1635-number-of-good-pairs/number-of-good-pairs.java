class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (set.containsKey(nums[i])) {
                int preVal = set.get(nums[i]);
                goodPairs += preVal;
                set.put(nums[i], ++preVal);
            }
            else set.put(nums[i], 1);
        }
        return goodPairs;
    }
}
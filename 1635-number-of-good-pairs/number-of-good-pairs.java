class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (set.containsKey(nums[i])) {
                goodPairs += set.get(nums[i]);
                set.put(nums[i], set.get(nums[i])+1);
            }
            else set.put(nums[i], 1);
        }
        return goodPairs;
    }
}
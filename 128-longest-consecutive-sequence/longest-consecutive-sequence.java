class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int maxL = 0;
        for (int n : set) {
            if (!set.contains(n-1)) {
                int currL = 0;
                while (set.contains(n+currL)) currL++;
                maxL = Math.max(currL, maxL);
            }
        }

        return maxL;
    }
}
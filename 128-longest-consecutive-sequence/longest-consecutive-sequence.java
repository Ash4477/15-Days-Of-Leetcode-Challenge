class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int maxL = 0;
        for (int n : set) {
            if (!set.contains(n-1)) {
                int currLen = 1;

                while (set.contains(n + 1)) {
                    n++;
                    currLen++;
                }

                maxL = Math.max(currLen, maxL);
            }
        }

        return maxL;
    }
}
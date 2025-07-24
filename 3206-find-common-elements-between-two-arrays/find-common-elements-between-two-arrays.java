class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] count = new int[2];
        HashMap<Integer, Boolean> a = new HashMap<>();

        for (int num : nums2) {
            a.put(num, true);
        }

        for (int num : nums1) {
            if (a.containsKey(num)) count[0]++;
        }

        a.clear();
        for (int num : nums1) {
            a.put(num, true);
        }

        for (int num : nums2) {
            if (a.containsKey(num)) count[1]++;
        }

        return count;
    }
}
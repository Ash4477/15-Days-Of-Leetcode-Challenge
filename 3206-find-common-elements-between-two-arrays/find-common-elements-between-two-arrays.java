class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] count = new int[2];
        HashSet<Integer> a = new HashSet<>();

        for (int num : nums2) {
            a.add(num);
        }

        for (int num : nums1) {
            if (a.contains(num)) count[0]++;
        }

        a.clear();
        for (int num : nums1) {
            a.add(num);
        }

        for (int num : nums2) {
            if (a.contains(num)) count[1]++;
        }

        return count;
    }
}
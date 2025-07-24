class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        int[] count = new int[101];

       for (int num : nums1) {
            count[num]++;
        }

        for (int num : nums2) {
            if (count[num] > 0) res[1]++;
        }

        count = new int[101];


        for (int num : nums2) {
            count[num]++;
        }

        for (int num : nums1) {
            if (count[num] > 0) res[0]++;
        }

        return res;
    }
}
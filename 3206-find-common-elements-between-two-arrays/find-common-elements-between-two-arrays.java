class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        int[] count1 = new int[101];
        int[] count2 = new int[101];

       for (int num : nums1) {
            count1[num]++;
        }

        for (int num : nums2) {
            count2[num]++;
        }


        for (int num : nums1) {
            if (count2[num] > 0) res[0]++;
        }

        for (int num : nums2) {
            if (count1[num] > 0) res[1]++;
        }

        return res;
    }
}
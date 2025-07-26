class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int resIdx = 0, p1 = 0, p2 = 0;

        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) res[resIdx++] = nums1[p1++];
            else if (nums1[p1] > nums2[p2]) res[resIdx++] = nums2[p2++];
            else {
                res[resIdx++] = nums1[p1++];
                res[resIdx++] = nums2[p2++];
            }
        }

        while (p1 < m) res[resIdx++] = nums1[p1++];

        while (p2 < n) res[resIdx++] = nums2[p2++];

        for (int j=0; j<resIdx; j++) {
            nums1[j] = res[j];
        }
    }
}
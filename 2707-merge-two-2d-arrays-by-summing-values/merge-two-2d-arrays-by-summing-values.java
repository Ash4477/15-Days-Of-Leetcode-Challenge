class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> li = new ArrayList<>();
        int p1=0, p2=0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1][0] == nums2[p2][0]) {
                li.add(new int[]{nums1[p1][0], nums2[p2++][1] + nums1[p1++][1]});
            }
            else if (nums1[p1][0] < nums2[p2][0]) li.add(nums1[p1++]);
            else li.add(nums2[p2++]);
        }

        while (p1 < nums1.length) {
            li.add(nums1[p1++]);
        }

        while (p2 < nums2.length) {
            li.add(nums2[p2++]);
        }

        return li.toArray(new int[li.size()][]);
    }
}
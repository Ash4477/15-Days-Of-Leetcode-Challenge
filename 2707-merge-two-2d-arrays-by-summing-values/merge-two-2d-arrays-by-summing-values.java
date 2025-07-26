class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> li = new ArrayList<>();
        int p1=0, p2=0;
        while (p1 < nums1.length && p2 < nums2.length) {
            int[] curr = new int[2];
            if (nums1[p1][0] == nums2[p2][0]) {
                curr[0] = nums1[p1][0];
                curr[1] = nums1[p1++][1] + nums2[p2++][1];
            }
            else if (nums1[p1][0] < nums2[p2][0]) {
                curr[0] = nums1[p1][0];
                curr[1] = nums1[p1++][1];
            }
            else {
                curr[0] = nums2[p2][0];
                curr[1] = nums2[p2++][1];
            }
            li.add(curr);
        }

        while (p1 < nums1.length) {
            li.add(new int[]{ nums1[p1][0], nums1[p1++][1] });
        }

        while (p2 < nums2.length) {
            li.add(new int[]{ nums2[p2][0], nums2[p2++][1] });
        }

        int size = li.size();
        int[][] result = new int[size][2];
        for (int i=0; i<size; i++) {
            result[i][0] = li.get(i)[0];
            result[i][1] = li.get(i)[1];
        }

        return result;
    }
}
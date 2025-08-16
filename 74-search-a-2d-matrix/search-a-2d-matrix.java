class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;

        while (l <= r) {
            int mid = l + (r-l) / 2;
            int row = mid / n;
            int col = mid % n;
            int midVal = matrix[row][col];

            if (midVal == target) return true;
            else if (midVal < target) l = mid+1;
            else r = mid-1;
        }

        return false;
    }
}
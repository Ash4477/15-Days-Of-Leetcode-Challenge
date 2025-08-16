class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;

        for (int i=0; i<matrix.length; i++) {
            if (matrix[i][0] == target) return true;
            if (matrix[i][0] <= target) targetRow = i;
        }

        if (targetRow == -1) return false;

        int l = 0, r = matrix[0].length-1;

        while (l <= r) {
            int mid = l + (r-l) / 2;

            if (matrix[targetRow][mid] == target) return true;
            
            if (matrix[targetRow][mid] < target) l = mid+1;
            else r = mid-1;
        }

        return false;
    }
}
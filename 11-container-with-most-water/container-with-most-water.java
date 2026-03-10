class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currArea = right - left;
            if (height[left] < height[right]) currArea *= height[left++]; 
            else currArea *= height[right--];
            if (currArea > maxArea) maxArea = currArea;
        }

        return maxArea;
    }
}
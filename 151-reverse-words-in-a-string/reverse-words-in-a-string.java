class Solution {
    public String reverseWords(String s) {
        String[] reverse = s.trim().split("\\s+");
        int left = 0;
        int right = reverse.length-1;
        while (left < right) {
            String temp = reverse[left];
            reverse[left++] = reverse[right];
            reverse[right--] = temp;
        }
        return String.join(" ", reverse);
    }
}
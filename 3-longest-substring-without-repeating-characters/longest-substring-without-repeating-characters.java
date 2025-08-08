class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] freq = new boolean[256];
        char[] str = s.toCharArray();
        int currLen = 0;
        int maxLen = 0;
        int left = 0;
        for (int i=0; i<str.length; i++) {
            char ch = str[i];
            while (freq[ch]) {
                freq[str[left++]] = false;
                currLen--;
            }
            freq[ch] = true;
            currLen++;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0, max = 0;
        int[] freq = new int[26];

        for (int r=0; r<n; r++) {
            char c = s.charAt(r);
            freq[c - 'A']++;
            max = Math.max(max, freq[c-'A']);

            if (r - left + 1 - max > k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }
        }
        return n - left;
    }
}
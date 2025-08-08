class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0, max = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int r=0; r<n; r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            max = Math.max(max, freq.get(c));

            if (r - left + 1 - max > k) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return n - left;
    }
}
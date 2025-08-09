class Solution {
    public boolean check(String t, int[] freq) {
        for (char c : t.toCharArray()) {
            if (freq[c] > 0) return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int targetCharsRemaining = t.length();
        int[] minWindow = {0, Integer.MAX_VALUE};
        int left = 0;

        for (int right=0; right<s.length(); right++) {
            char ch = s.charAt(right);
            if (freq.getOrDefault(ch, 0) > 0) targetCharsRemaining--;
            freq.put(ch, freq.getOrDefault(ch, 0) - 1);

            if (targetCharsRemaining == 0) {
                while (true) {
                    char charAtStart = s.charAt(left);
                    if (freq.getOrDefault(charAtStart, 0) == 0) break;
                    freq.put(charAtStart, freq.getOrDefault(charAtStart, 0) + 1);
                    left++;
                }
                if (right-left < minWindow[1] - minWindow[0]) {
                    minWindow[0] = left;
                    minWindow[1] = right;
                }
                 freq.put(s.charAt(left), freq.getOrDefault(s.charAt(left), 0) + 1);
                targetCharsRemaining++;
                left++;

            }
        }
                return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);        

    }
}
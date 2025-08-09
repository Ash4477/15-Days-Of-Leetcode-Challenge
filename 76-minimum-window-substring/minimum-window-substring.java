class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] tCount = new int[128];
        for (char c : t.toCharArray()) {
            tCount[c]++;
        }

        int required = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, resStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);

            if (tCount[rChar] > 0) required--;
            tCount[rChar]--;

            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    resStart = left;
                }

                char lChar = s.charAt(left);
                tCount[lChar]++;

                if (tCount[lChar] > 0) required++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resStart, resStart + minLen);
    }
}
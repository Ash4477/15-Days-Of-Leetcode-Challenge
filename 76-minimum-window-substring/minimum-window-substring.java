class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCount = new HashMap<>();
        int have = 0, need = tCount.size();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int resStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && windowCount.get(c).intValue() == tCount.get(c).intValue()) have++;

            while (have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    resStart = left;
                }

                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);

                if (tCount.containsKey(leftChar) && windowCount.get(leftChar).intValue()< tCount.get(leftChar).intValue()) have--;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(resStart, resStart + minLen);
    }
}
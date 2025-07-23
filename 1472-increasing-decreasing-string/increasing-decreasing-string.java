class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        StringBuilder res = new StringBuilder();

        int n = s.length();
        for (int i=0; i<n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        while (res.length() < s.length()) {
            for (int i=0; i<26; i++) {
                if (count[i] > 0) {
                    res.append((char) ('a' + i));
                    count[i]--;
                }
            }

            for (int i=25; i>=0; i--) {
                if (count[i] > 0) {
                    res.append((char) ('a' + i));
                    count[i]--;
                }
            }
        }
        return res.toString();
    }
}
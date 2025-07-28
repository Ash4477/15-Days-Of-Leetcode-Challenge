class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0, p2 = 0, n1 = word1.length(), n2 = word2.length();
        char[] res = new char[n1+n2];
        int resIdx = 0;

        while (p1 < n1 && p2 < n2) {
            res[resIdx++] = word1.charAt(p1++);
            res[resIdx++] = word2.charAt(p2++);
        }

        while (p1<n1) res[resIdx++] = word1.charAt(p1++);
        while (p2<n2) res[resIdx++] = word2.charAt(p2++);

        return new String(res);
    }
}